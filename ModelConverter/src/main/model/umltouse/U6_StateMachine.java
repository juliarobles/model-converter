package main.model.umltouse;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Vertex;

public class U6_StateMachine {
	
	private static boolean initialFound;
	
	private U6_StateMachine() {}
	
	static String analyzeStateMachine(StateMachine stateMachine, List<String> namesUsedParticular, U9_CountUnnamed countUnnamed) {
		StringBuilder sBuilder = new StringBuilder("");
		EList<Region> regions = stateMachine.getRegions();
		int transitions = 0, states = 0;
		initialFound = false;
		
		sBuilder.append("\t\tpsm " + U9_Auxiliary.checkUnnamed(stateMachine.getName(), namesUsedParticular, countUnnamed) + "\n");
		
		U9_CountUnnamed countUnnamedStates = new U9_CountUnnamed();
		List<String> namesUsedParticularStates = new ArrayList<>();
		
		sBuilder.append("\t\tstates\n");
		for(Region region : regions) {
			states += analyzeRegionStates(region, namesUsedParticularStates, countUnnamedStates, sBuilder);
		}
		
		sBuilder.append("\t\ttransitions\n");
		for(Region region : regions) {
			transitions += analyzeRegionTransitions(region, sBuilder);
		}
		
		sBuilder.append("\t\tend");
		
		if(transitions == 0 || states < 2) {
			System.out.println("WARNING: Protocol State Machine with no transitions or at least two states found. It will be commented.");
			return "--" + sBuilder.toString().replaceAll("\n", "\n--") + "\n";
		}
		
		return sBuilder.toString() + "\n";
	}

	private static int analyzeRegionStates(Region region, List<String> namesUsedParticular, U9_CountUnnamed countUnnamed, StringBuilder sBuilder) {
		int states = 0;
		for(Vertex vertex : region.getSubvertices()) {
			if (vertex instanceof FinalState) {
				states++;
				vertex.setName(U9_Auxiliary.checkUnnamed(vertex.getName(), namesUsedParticular, countUnnamed));
				sBuilder.append("\t\t\t" + vertex.getName() + " : final\n");
			} else if (vertex instanceof State) {
				states++;
				vertex.setName(U9_Auxiliary.checkUnnamed(vertex.getName(), namesUsedParticular, countUnnamed));
				String aux = "\t\t\t" + vertex.getName();
				
				State state = (State) vertex;
				if(state.getStateInvariant() != null && state.getStateInvariant().getSpecification() != null && state.getStateInvariant().getSpecification().stringValue() != null) {
					aux += " [" + state.getStateInvariant().getSpecification().stringValue() + "]";
				}
				
				sBuilder.append(aux + "\n");
			} else if (vertex instanceof Pseudostate) {
				states++;
				Pseudostate pseudostate = (Pseudostate) vertex;
				vertex.setName(U9_Auxiliary.checkUnnamed(vertex.getName(), namesUsedParticular, countUnnamed));
				if(!initialFound && pseudostate.getKind() == PseudostateKind.INITIAL_LITERAL) {
					sBuilder.append("\t\t\t" + vertex.getName() + " : initial\n");
					initialFound = true;
				} else {
					sBuilder.append("\t\t\t" + vertex.getName() + "\n");
				}
				
			}
		}
		return states;
	}
	
	private static int analyzeRegionTransitions(Region region, StringBuilder sBuilder) {		
		int transitions = 0;
		for(Transition transition : region.getTransitions()) {
			if(transition.getTarget() != null && transition.getSource() != null) {
				transitions++;
				String aux = "\t\t\t" + transition.getSource().getName() + " -> " + transition.getTarget().getName();
				
				EList<Trigger> triggers = transition.getTriggers();
				Constraint preCondition = transition.getGuard();
				Constraint postCondition = null;
				EList<Constraint> postConditions = transition.getOwnedRules();
				
				if(preCondition != null) postConditions.remove(preCondition);
				if(postConditions.size() > 0) postCondition = postConditions.get(0); 
				
				if(triggers.size() > 0){
					aux += "\t {";
					if(preCondition != null && preCondition.getSpecification() != null && preCondition.getSpecification().stringValue() != null) {
						aux += " [" + preCondition.getSpecification().stringValue() + "]";
					}
					aux += " " + ((CallEvent)triggers.get(0).getEvent()).getOperation().getName() + "()";
					if(postCondition != null && postCondition.getSpecification() != null && postCondition.getSpecification().stringValue() != null) {
						aux += " [" + postCondition.getSpecification().stringValue() + "]";
					}
					aux += " }";
				}
				
				sBuilder.append(aux + "\n");
			}
		}
		return transitions;
		
	}
}
