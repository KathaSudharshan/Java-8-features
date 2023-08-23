package com.java.features.methodReference;

import com.java.features.lambda.Vehicle;

public class Bus{
	public static void info(){
		// TODO Auto-generated method stub
     System.out.println("Bus Info");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=Bus::info;
		vehicle.engine();
        //Using predefined Functional Interface
		Thread th=new Thread(Bus::info);
		th.start();
		
		
	}

}
