package com.java.features.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEachExamples {
	
	public static void main(String[] args) {
		System.out.println("ForEach with LIST");
		List<String> list=new ArrayList<String>();
		list.add("Tiger");
		list.add("Lion");
		list.add("Cat");
		list.add("dog");

		//before normal loop
		System.out.println("Enahanced for loop");
		for(String animal:list){
		 System.out.println(animal);
		}

		//with Lambda expression and forEach
		System.out.println("For Each method with Lambda Expression");
		list.forEach(animal -> System.out.println(animal));
     
		System.out.println("For Each method with method reference");
		//forach with method reference
		list.forEach(System.out::println);
		
		System.out.println("ForEach with SET");		
		Set<String> set=new HashSet<String>();
		set.add("Tiger");
		set.add("Lion");
		set.add("Cat");
		set.add("dog");
		//set.add(null);
		System.out.println("For Each method with Lambda Expression");
		set.forEach(animal -> System.out.println(animal));
		
		System.out.println("ForEach with SET and Stream");
		set.stream().filter(animal -> animal.contains("i")).forEach(animal -> System.out.println(animal));
		System.out.println("ForEachOrdered and Stream");
		set.stream().forEachOrdered(animal -> System.out.println(animal));
		
		System.out.println("ForEach with Map");	
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("1", "Lion");
		map.put("2", "Tiger");
		map.put("3", "Cat");
		map.put("4", "Dog");
		
		map.forEach((id, animal) -> System.out.println("Key: "+id+" value: "+animal) );
		
	}

}
