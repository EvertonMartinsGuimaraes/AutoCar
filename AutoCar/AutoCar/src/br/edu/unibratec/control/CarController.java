package br.edu.unibratec.control;

import br.edu.unibratec.model.CarFiat;
import interfaces.ICarModel;

public class CarController {
	private ICarModel car;

	/*ALTERAR VEICULO NESSE METODO.
	METODO CONSTRUTOR DO VEICULO.
	*/
	public CarController() {
		car = new CarFiat();

	}

//METODO GET DE ACESSO AO OBJETO CARMODEL.
	public ICarModel getCarModel() {
		return this.car;
	}

}