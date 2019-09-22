package br.edu.unibratec.view;

import br.edu.unibratec.control.PlaceController;

public class VehicleFront {
	public static void main(String[] args) {

		VehicleController V = new VehicleController();
		V.carStatus();
		PlaceController P = new PlaceController();
		P.addInitialPlaces();
		P.getPlacesList();

	}
}
