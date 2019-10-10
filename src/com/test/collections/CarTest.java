package com.test.collections;

public class CarTest {
public static void main(String[] args) {
	 Car car=new  ManualCar();
	 Car car1=new  AutomaticCar();
	 
	 car.turnOnCar();
	 car.turnOffCar();
	 System.out.println(car.getCarType());
	 
	 car1.turnOnCar();
	 car1.turnOffCar();
	 System.out.println(car1.getCarType());
}
}
