package com.java.features.lambda;

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

	}

}
