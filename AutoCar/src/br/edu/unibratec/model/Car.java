package br.edu.unibratec.model;

public class Car {
	private double oilLevel;
	private double waterLevel;
	private int currentKm;
	private int remainingKm;
	private double gasLevel;
	public double getOilLevel() {
		return oilLevel;
	}
	public void setOilLevel(double oilLevel) {
		this.oilLevel = oilLevel;
	}
	public double getWaterLevel() {
		return waterLevel;
	}
	public void setWaterLevel(double waterLevel) {
		this.waterLevel = waterLevel;
	}
	public int getCurrentKm() {
		return currentKm;
	}
	public void setCurrentKm(int currentKm) {
		this.currentKm = currentKm;
	}
	public int getRemainingKm() {
		return remainingKm;
	}
	public void setRemainingKm(int remainingKm) {
		this.remainingKm = remainingKm;
	}
	public double getGasLevel() {
		return gasLevel;
	}
	public void setGasLevel(double gasLevel) {
		this.gasLevel = gasLevel;
	}
	
	
}
