package com.java.equalsandhashcode;

import java.util.Objects;

public class EqualsHashcodeTest {
	
	 private Integer id;
	 private String name;

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EqualsHashcodeTest test=new EqualsHashcodeTest();
		test.setId(10);
		test.setName("test");
		
		EqualsHashcodeTest test1=new EqualsHashcodeTest();
		test1.setId(10);
		test1.setName("test");
		
		System.out.println(test.getId().equals((test1.getId())));
		System.out.println(test.getId().hashCode()+ " "+test1.getId().hashCode());
		System.out.println(test.equals(test1));
		System.out.println(test.hashCode()+ " "+test1.hashCode());
		
		System.out.println(test == test1);

	}


	
	  @Override public int hashCode() {
		  return Objects.hash(id, name); 
		  }
	 


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsHashcodeTest other = (EqualsHashcodeTest) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

}
