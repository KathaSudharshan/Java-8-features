package com.java.features.functionalInterface;

import com.java.features.lambda.Vehicle;

public class Car implements Vehicle {

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Car Engine");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car car=new Car();
        
        car.engine();
        car.info();
	}

}
