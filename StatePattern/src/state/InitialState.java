package state;

public class InitialState implements State {

	@Override
	public void playPressed() {
		System.out.println("Video is starting");
	}

}
