package br.edu.unibratec.control;

import br.edu.unibratec.model.CarVolkswagem;
import interfaces.ICarModel;

public class CarController {
	private ICarModel car;

//ALTERAR VEICULO NESSE METODO.
	public CarController() {
		car = new CarVolkswagem();

	}

	public ICarModel getCarModel() {
		return this.car;
	}

}