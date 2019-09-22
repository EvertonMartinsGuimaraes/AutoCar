package br.edu.unibratec.view;

import java.util.Scanner;

import br.edu.unibratec.control.PlaceController;
import br.edu.unibratec.model.Place;
import br.edu.unibratec.model.Place.ROUTE_TYPE;

public class VehicleFront {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VehicleController V = new VehicleController();
		V.carStatus();
		PlaceController P = new PlaceController();
		P.addInitialPlaces();
		int i = 0;
		for (Place places : P.getPlacesList()) {
			i++;
			System.out.println(i + "- " + places.getName());
		}
		System.out.println("Ola cara, Qual local você quer ir? Digite o numero correspondente ao local.");
		int place = Integer.parseInt(input.next());
		int placeDistance = P.getPlacesList().get(place-1).getDistance();
		ROUTE_TYPE typeRoute = P.getPlacesList().get(place-1).getRoute();
		
		V.setTrack(placeDistance, typeRoute);
		
	}
}
