package br.edu.unibratec.view;

import java.text.DecimalFormat;

import br.edu.unibratec.control.CarController;
import br.edu.unibratec.model.Place.ROUTE_TYPE;

public class VehicleController {
	CarController carC = new CarController();

	public void carStatus() {

		DecimalFormat df = new DecimalFormat("###,##0");

		System.out.println("\nGasolina:" + df.format(this.carC.getCarModel().getGasLevel()) + " %\nKm atual: "
				+ this.carC.getCarModel().getCurrentKm() + " KM\nProxima revisao: "
				+ this.carC.getCarModel().getNextReview() + " KM\nOleo:" + this.carC.getCarModel().getOilLevel()
				+ " ML\nKm para proxima revisao: " + this.carC.getCarModel().getRemainingKm() + " KM\nNivel da agua: "
				+ this.carC.getCarModel().getWaterLevel() + " ML");
	}

	public void setTrack(int km, ROUTE_TYPE type) {
		double routeRate=0;
		
		if (type == ROUTE_TYPE.URBAN) {
			routeRate=1.03;

		} else if (type == ROUTE_TYPE.ROADWAY) {
			routeRate=1.01;
		}
		this.carC.getCarModel().setGasReduction(km, routeRate);
		this.carC.getCarModel().setKmForReview();
		this.carC.getCarModel().setKmReduction(km, routeRate);
		this.carC.getCarModel().setNewReview();
		this.carC.getCarModel().setOilReduction(km, routeRate);
		this.carC.getCarModel().setWaterReduction(km, routeRate);
	}

}
