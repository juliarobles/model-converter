package test.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class TStateMachine {
	private String name;
	private List<TState> states;
	private List<TTransition> transitions;
	
	public TStateMachine(String name) {
		this.name = name;
		states = new ArrayList<>();
		transitions = new ArrayList<>();
	}

	public void addState(TState state) {
		states.add(state);
	}

	public void addTransition(TTransition transition) {
		transitions.add(transition);
	}
	
	public int getStatesSize() {
		return states.size();
	}

	public int getTransitionsSize() {
		return transitions.size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((states == null) ? 0 : states.hashCode());
		result = prime * result + ((transitions == null) ? 0 : transitions.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TStateMachine other = (TStateMachine) obj;
		if (name == null) {
			if (other.name != null && !other.name.contains("unnamed") && !other.name.isBlank())
				return false;
		} else if (!name.equals(other.name)
					&& !(name.isBlank() && other.name == null)
					&& !(name.isBlank() && other.name.contains("unnamed"))
					&& !((other.name == null || other.name.isBlank()) && name.contains("unnamed"))
					&& !((other.name != null && name.contains(other.name) && name.length() == other.name.length()+1))
					&& !((other.name != null && other.name.contains(name) && other.name.length() == name.length()+1)))
			return false;
		if (states == null) {
			if (other.states != null)
				return false;
		} else if (!states.containsAll(other.states) || !other.states.containsAll(states))
			return false;
		if (transitions == null) {
			if (other.transitions != null)
				return false;
		} else {
			if (!transitions.containsAll(other.transitions) || !other.transitions.containsAll(transitions)) return false;
		}
		return true;
	}
}
