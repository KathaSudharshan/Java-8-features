package com.java.equalsandhashcode;

import java.util.HashMap;
import java.util.Map;

public class AddressClient {
	
	public static String getAddress(Map map, Employee emp) {
		Address adr=(Address)map.get(emp);
		return adr.getAddress();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee(123, "Employee 1");
		System.out.println(emp1.hashCode());
		Address adr1=new Address(123, "Street 1", "State 1", 1233, "IND");
		
		Employee emp2=new Employee(124, "Employee 2");
		Address adr2=new Address(124, "Street 2", "State 1", 1244, "IND");
		
		Map<Employee, Address> map=new HashMap<>();
		map.put(emp1, adr1);
		map.put(emp2, adr2);
		System.out.println(new Employee(123, "Employee 1").hashCode());

		
		System.out.println(getAddress(map,new Employee(123, "Employee 1")));
        
	}

}
