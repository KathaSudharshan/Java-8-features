package com.java.features.methodReference;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Animal animal = Wild::new;
       animal.info("Wild Animal");
	}

}
