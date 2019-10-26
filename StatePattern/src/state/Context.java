package state;

public class Context {
	private State state;

	public void setContext(State state) {
		this.state = state;
	}

	public void requestState() {
		state.playPressed();
	}
}
