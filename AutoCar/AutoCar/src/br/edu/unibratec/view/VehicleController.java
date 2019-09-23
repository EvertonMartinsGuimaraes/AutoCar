package br.edu.unibratec.view;

import java.text.DecimalFormat;

import br.edu.unibratec.control.CarController;
import br.edu.unibratec.control.PlaceController;
import br.edu.unibratec.model.Place;
import br.edu.unibratec.model.Place.ROUTE_TYPE;

public class VehicleController {
	CarController carC = new CarController();
	PlaceController placeC = new PlaceController();

	
	// MOSTRA O STATUS DO CARRO
	public void carStatus() {

		DecimalFormat df = new DecimalFormat("###,##0");

		System.out.println("\nGasolina:" + df.format(this.carC.getCarModel().getGasLevel()) + " %\nKm atual: "
				+ this.carC.getCarModel().getCurrentKm() + " KM\nProxima revisao: "
				+ this.carC.getCarModel().getNextReview() + " KM\nOleo:"
				+ df.format(this.carC.getCarModel().getOilLevel()) + " ML\nKm para proxima revisao: "
				+ this.carC.getCarModel().getRemainingKm() + " KM\nNivel da agua: "
				+ df.format(this.carC.getCarModel().getWaterLevel()) + " ML\n\n");
	}

	//MOSTRA O STATUS DA VIAGEM FEITA
	public void tripStatus(String nome, int distance) {

		System.out.println("\n\nViagem feita para: " + nome + " / Distancia percorrida: " + distance);
	}
	
	// SETA AS REDUÇOES APOS CONFIRMAÇÃO DA ROTA
	public void setTrack(int km, ROUTE_TYPE type) {
		double routeRate = 0;

		if (type == ROUTE_TYPE.URBAN) {
			routeRate = 0.95;

		} else if (type == ROUTE_TYPE.ROADWAY) {
			routeRate = 0.98;
		}
		this.carC.getCarModel().setGasReduction(km, routeRate);
		this.carC.getCarModel().setKmForReview();
		this.carC.getCarModel().setKmReduction(km, routeRate);
		this.carC.getCarModel().setNewReview();
		this.carC.getCarModel().setOilReduction(km, routeRate);
		this.carC.getCarModel().setWaterReduction(km, routeRate);
	}

}
