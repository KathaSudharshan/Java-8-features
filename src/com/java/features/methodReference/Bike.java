package com.java.features.methodReference;

import com.java.features.lambda.Vehicle;

public class Bike {

	public void Info(){
		  System.out.println("Bike Info");
		 }
	Bike(){
		System.out.println("Default Constructor");
	}
	Bike(String msg){
		System.out.println("Argument Constructor");
	}
	public static void main(String[] args){
		  Bike bike=new Bike();
		  //method reference using instance method 
		  Vehicle vehicle=bike::Info;
		   vehicle.engine();
		  //Instance object creation along with instance method reference
		 Vehicle bikeVehicle=new Bike()::Info;
		     bikeVehicle.engine();

		 }

}
