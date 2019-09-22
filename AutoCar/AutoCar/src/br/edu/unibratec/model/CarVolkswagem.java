package br.edu.unibratec.model;

import interfaces.ICarModel;

public class CarVolkswagem extends Car implements ICarModel {

	private static final double oilReductionRate = 0.03, waterReductionRate = 0.02, gasReductionRate = 7;
	private static final int eachReviewKm = 5000;

	public CarVolkswagem(double oilLevel, double waterLevel, int currentKm, int remainingKm, double gasLevel) {
		super(oilLevel, waterLevel, currentKm, remainingKm, gasLevel);
		setNextReview(eachReviewKm);
	}

	public static double getOilreductionrate() {
		return oilReductionRate;
	}

	public static double getWaterreductionrate() {
		return waterReductionRate;
	}

	public static double getGasreductionrate() {
		return gasReductionRate;
	}

	public static int getEachreviewkm() {
		return eachReviewKm;
	}

	public void setOilReduction(int kmDistance) {

		setOilLevel(getOilLevel() - (getOilreductionrate() * kmDistance));
	}

	public void setWaterReduction(int kmDistance) {
		setWaterLevel(getWaterLevel() - (getWaterreductionrate() * kmDistance));
	}

	public void setGasReduction(int kmDistance) {
		setGasLevel(getGasLevel() - (kmDistance/getGasreductionrate()));
	}

	public void setKmReduction(int kmDistance) {
		setCurrentKm((getCurrentKm() + kmDistance));

	}

	public void setKmForReview() {

		setRemainingKm(getNextReview() - (getCurrentKm()));
	}

	public void setNewReview(int kmDistance) {
		int km = getCurrentKm() + kmDistance;
		int nextReview = getEachreviewkm();

		for (; km / getEachreviewkm() >= 1;) {
			km = km - getEachreviewkm();
			nextReview = nextReview + getEachreviewkm();
		}
		setNextReview(nextReview);
	}
}
