package br.edu.unibratec.model;

import interfaces.ICarModel;

public class CarVolkswagem extends Car implements ICarModel {

	private static final double oilReductionRate = 0.03, waterReductionRate = 0.02, gasConsumptionRate = 5;
	private static final int eachReviewKm = 5000;
	int newKm=0;
	double newOilLevel=1000;
	double newGasLevel=100;
	double newWaterLevel=1000;
	int newNextReview =eachReviewKm;
	int newRemainingKm = eachReviewKm;
	
	
	
	public CarVolkswagem() {
		super.setOilLevel(1000);
		super.setCurrentKm(0);
		super.setGasLevel(100);
		super.setNextReview(eachReviewKm);
		super.setRemainingKm(eachReviewKm);
		super.setWaterLevel(1000);
	}

	//ABAIXO OS METODOS PARA ALTERAÇÃO DE NIVEIS E KM
	
	//routeRate É A TAXA DE VARIAÇÃO CONFORME A ROTA ESCOLHIDA. TRECHO URBAN CONSOME MAIS.
	
	public void oilReduction(int kmDistance, double routeRate) {
		
		newOilLevel = ((super.getOilLevel() - (getOilreductionrate() * kmDistance))*routeRate);
	}

	public void waterReduction(int kmDistance, double routeRate) {
		
		newWaterLevel = ((super.getWaterLevel() - (getWaterreductionrate() * kmDistance))*routeRate);
	}

	public void gasReduction(int kmDistance, double routeRate) {
		newGasLevel = ((super.getGasLevel() - (kmDistance  / gasConsumptionRate()))*routeRate);
	}

	public void newKm(int kmDistance, double routeRate) {
		newKm = ((super.getCurrentKm() + kmDistance));

	}
	
	public void overhaul(int gasRefill, int watterRefill, int oilRefill) {
			setGasLevel(gasRefill);
			setOilLevel(oilRefill);
			setWaterLevel(watterRefill);
		}

	public void kmForReview() {

		newRemainingKm = (super.getNextReview() - (super.getCurrentKm()));
	}

	public void newReview() {
		int km = super.getCurrentKm();
		int nextReview = getEachreviewkm();

		for (; km / getEachreviewkm() >= 1;) {
			km = km - getEachreviewkm();
			nextReview = nextReview + getEachreviewkm();
		}
		newNextReview = nextReview;
	}

	//METODOS GET PARA UMA POSSIVEL ALTERAÇÃO PENDENTE POR CONFIRMAÇÃO DA CORRIDA.
	public int getKm() {
		return newKm;
	}
	
	public double getGas() {
		return newGasLevel;
	}
	
	public double getWater() {
		return newWaterLevel;
	}
	
	public double getOil() {
		return newOilLevel;
	}
	
	public int getReview() {
		return newNextReview;
	}
	
	public int getRemaining() {
		return newRemainingKm;
	}
	
	//METODOS GET E SET DOS VALORES JA ALTERADOS CORRESPONDENTE A CORRIDA.
	public static double getWaterreductionrate() {
		return waterReductionRate;
	}

	public static double gasConsumptionRate() {
		return gasConsumptionRate;
	}

	public static double getOilreductionrate() {
		return oilReductionRate;
	}

	public static int getEachreviewkm() {
		return eachReviewKm;
	}
	
	public double getOilLevel() {
		return super.getOilLevel();
	}

	public double getGasLevel() {
		return super.getGasLevel();
	}

	public double getWaterLevel() {
		return super.getWaterLevel();
	}

	public int getCurrentKm() {
		return super.getCurrentKm();
	}
	
	public int getNextReview() {
		return super.getNextReview();
	}
	
	public int getRemainingKm() {
		return super.getRemainingKm();
	}

	public void setOilReduction() {
		super.setOilLevel(newOilLevel);
		
	}

	public void setWaterReduction() {
		super.setWaterLevel(newWaterLevel);
		
	}


	public void setGasReduction() {
		super.setGasLevel(newGasLevel);
		
	}


	public void setNewKm() {
		super.setCurrentKm(newKm);
		
	}


	public void setKmForReview() {
		super.setRemainingKm(newRemainingKm);
		
	}


	public void setNewReview() {
		super.setNextReview(newNextReview);
	}

}