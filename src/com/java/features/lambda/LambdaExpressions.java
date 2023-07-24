package com.java.features.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class BMWVehicle{
	String model;
	String type;
	int id;
	float price;
	
	public BMWVehicle(String model,String type,int id, float price) {
		super();
		this.model=model;
		this.type=type;
		this.id=id;
		this.price=price;
	}
}

public class LambdaExpressions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//without Lambda Expression
		Vehicle vhl=new Vehicle(){
			public void engine() {
				System.out.println("Vehicel Engine for CAR without Lambda");
			}
		};
		
		vhl.engine();
		
		//With Lambda Expression
		Vehicle vhlWithLambda=() -> {
			System.out.println("Vehicel Engine for CAR with Lambda");
		};
		vhlWithLambda.engine();
		
		
		//Lambda Expression with single parameter
		
		VehicleEngine vEngine=(String number)->{

			 return "Car vehile engine model is "+number;
		};
		System.out.println(vEngine.model("Audi"));
		
		//Lambda Expression with multiple parameters
		VehicleType vType=(String model, String company) -> {
			return "vehicle model is "+ model + " and company is " +company;
		};
		System.out.println(vType.typeOfVehicle("SUV", "BMW"));
		
		//Lambda Expression with forEach loop
		List<String> listOfVehicles=new ArrayList<String>();  
		listOfVehicles.add("BMW");  
		listOfVehicles.add("Audi");  
		listOfVehicles.add("Ferrari");  
		listOfVehicles.add("Toyota");
		listOfVehicles.add("SKODA");
		
		System.out.println("Using ForEach method and Lambda Expression");
		listOfVehicles.forEach(  
            (vechileName)-> System.out.println(vechileName)  
        );
		
		//Lambda Expression on Collection using filter
		System.out.println("Lambda Expression on Collection using filter");

		List<BMWVehicle> bmwVehList=new ArrayList<BMWVehicle>();
		
		bmwVehList.add(new BMWVehicle("m1", "compact", 1, 2000000));
		bmwVehList.add(new BMWVehicle("m2", "SUV", 2, 5000000));
		bmwVehList.add(new BMWVehicle("m3", "compact", 3, 2200000));
		bmwVehList.add(new BMWVehicle("m4", "SUV", 4, 5500000));
		
		Stream<BMWVehicle> filterBMWVehicle=bmwVehList.stream().filter(bmw -> bmw.type == "SUV" );
		
		filterBMWVehicle.forEach(BMWVehicle -> System.out.println("BMWVehicle model "+BMWVehicle.model+" and price "+BMWVehicle.price));

	}

}
