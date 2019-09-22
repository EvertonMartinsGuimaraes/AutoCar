package br.edu.unibratec.control;

public class TrackController {
	private int startHour;
	private int endHour;

	public void setTrack(String name) {

	}

	public void changeTrack() {

	}

	private boolean hourValidate(int testHour) {
		if (0 >= testHour && testHour >= 23) {
			return true;
		} else
			return false;
	}
}
