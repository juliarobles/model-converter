package test.utilities;

import java.util.ArrayList;
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
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (states == null) {
			if (other.states != null)
				return false;
		} else if (!states.equals(other.states))
			return false;
		if (transitions == null) {
			if (other.transitions != null)
				return false;
		} else if (!transitions.equals(other.transitions))
			return false;
		return true;
	}
}
