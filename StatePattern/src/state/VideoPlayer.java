package state;

public class VideoPlayer {
	private State state;
	private Context context;
	private boolean playing = false;
	private boolean resume = false;

	public VideoPlayer() {
		this.context = new Context();
	}

	public void play() {
		if (!playing) {
			state = new InitialState();
			playing = true;
			stateActive();
		} else if (playing && !resume) {
			state = new PlayinState();
			resume = false;
			stateActive();
		} else {
			System.out.println("Video has not paused or played");
		}

	}

	public void pause() {
		if (!playing) {
			System.out.println("Video has not started");
		} else {
			state = new StandbyState();
			resume = true;
			stateActive();
		}
	}

	public void finish() {
		state = new FinishState();
		playing = false;
		stateActive();
	}

	private void stateActive() {
		context.setContext(state);
		context.requestState();
	}
}
