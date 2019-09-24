package interfaces;

//INTERFACE MODELO DOS CARROS A SEREM CRIADOS.
public interface ICarModel {

	// METODOS DE CALCULO PARA SETAR
	public void oilReduction(int kmDistance, double routeRate);

	public void waterReduction(int kmDistance, double routeRate);

	public void gasReduction(int kmDistance, double routeRate);

	public void newKm(int kmDistance, double routeRate);

	public void kmForReview();

	public void newReview();
	
	// METODOS GET DOS VALORES CALCULADOS
	public int getKm();

	public double getGas();

	public double getWater();

	public double getOil();

	public int getReview();

	public int getRemaining();

	// METODOS SET E GET DO CARRO JA SETADO
	public void setOilReduction();

	public void setWaterReduction();

	public void setGasReduction();

	public void setNewKm();

	public void setKmForReview();

	public void setNewReview();

	public void overhaul(int refillGas, int refillOil, int refillWatter);

	public double getOilLevel();

	public double getGasLevel();

	public double getWaterLevel();

	public int getCurrentKm();

	public int getRemainingKm();

	public int getNextReview();

}
