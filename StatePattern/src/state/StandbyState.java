package state;

public class StandbyState implements State {

	@Override
	public void playPressed() {
		System.out.println("Pause");
	}

}
