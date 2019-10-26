package state;

public class Cliente {
/*
 * Enrique Suárez Guette
 * State Pattern
 */
	public static void main(String[] args) {
		VideoPlayer video = new VideoPlayer();

		video.pause();
		video.play();
		video.pause();
		video.play();
		video.finish();
	}

}
