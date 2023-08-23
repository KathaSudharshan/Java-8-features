package com.java.features.lambda;

/**
 * 
 */
@FunctionalInterface
public interface Vehicle {
	
	void engine();
	
	default void info() {
		//Functional interface can have default, static and existing objects methods
		System.out.println("Vehicle info");
	}

}
