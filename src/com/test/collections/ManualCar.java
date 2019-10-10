package com.test.collections;



public class ManualCar implements Car{

	private String carType = "Manual";
	
	@Override
	public void turnOnCar() {
		// TODO Auto-generated method stub
		System.out.println("turn on the manual car");
		
	}

	@Override
	public void turnOffCar() {
		// TODO Auto-generated method stub
		System.out.println("turn off the manual car");
	}

	@Override
	public String getCarType() {
		// TODO Auto-generated method stub
		return this.getCarType();
	}

}
