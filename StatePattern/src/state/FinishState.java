package state;

public class FinishState implements State {

	@Override
	public void playPressed() {
		System.out.println("Video is done");
	}

}
