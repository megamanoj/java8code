package com.test.collections;

public class AutomaticCar implements Car{
	
	private String carType = "Automatic";
	@Override
	public void turnOnCar() {
		System.out.println("turn on the automatic car");
		
	}

	@Override
	public void turnOffCar() {
		System.out.println("turn off the automatic car");
		
	}

	@Override
	public String getCarType() {
		// TODO Auto-generated method stub
		return this.getCarType();
	}

}
