package br.edu.unibratec.model;

public class Place {
	private String name;
	private int kmZero;
	private boolean possiblePlace;

	public Place(String name, int kmZero, boolean possiblePlace) {
		this.name = name;
		this.kmZero = kmZero;
		this.possiblePlace = possiblePlace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKmZero() {
		return kmZero;
	}

	public void setKmZero(int kmZero) {
		this.kmZero = kmZero;
	}

	public boolean isPossiblePlace() {
		return possiblePlace;
	}

	public void setPossiblePlace(boolean possiblePlace) {
		this.possiblePlace = possiblePlace;
	}
}
