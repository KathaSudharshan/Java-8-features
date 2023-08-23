# Java-8-features
Java 8 features and its POCs (proof of concepts)

## Introduction
This docuement is to discuss about JAVA 8(1.8) New features and enahncements of existing features.
### JAVA 8 Features
Below are the JAVA 8 new features and enhacements,
1. Lambda Expressions
2. forEach() in Iterable interfaces
3. Method References
4. default and static methods in interfaces
5. Functional Interfaces
6. Streaming API for bulk operations in Collections
7. Java Time API
8. Collection API enhancements
9. Concurrency API enhancements
10. JDBC Enhancements
11. Base64 Encoding and Decoding
12. Type and Repeating annotations
13. Collectors Class
14. Optional Class
15. Java IO enhancements
16. Parllel Array Sorting

### 1. Lambda Expression
Lambda Expression is a new feature which is introduced in Java 8 version. 
It provides clear and short way to represent a method of Functional interface. Having one abstract method in interface class is known as Functional inteface. 

Lambda Expression used to provide the implemenation of functional interface and no need of overriding method proto type again for implementation. Helps to extract objects/data from collection and filters.

Lambda Expression Syntax

```bash 
 (arguments) -> {//implemenation logic}
```

There are 3 types of lambda expression paramters as below,

1. Zero or default parameter
2. one parameter
3. mutiple parameter(morethan one parameter)

Zero/default Parameter:

```bash
() -> {
       //implementation Logic
	   System.out.println("Lambda zero parameter");
      }
```	  
Single Parameter:

```bash
(data) -> {
       //implementation Logic
	   System.out.println("Lambda expression with one parameter as " +data);
      }
```  
Multiple Parameters:

```bash
(name,age) -> {
       //implementation Logic
	   System.out.println("Lambda expression with multiple parameter as " + data + "," + age);
      }
```  
Refere sample code for more info..


### 2. forEach() for Iterating Collection

forEach() method is a Java 8 new feature and this is defined as deafult method in Iterable and Stream functional interface. This method used for iterating data elements from collections classes which are extended from Iterable interface. Lambda expressions also can be used as this mehod defined in functional interface. ForEach() method accepted single parameter.

forEach() method reduces lof of code compared to previous.

forEach() method has been added in below interfcaes,

1. Iterable interface: Iterable.forEach() method available for all Collection classes other than Map.
2. Stream: forEach() and forEachOrdered() opertaions available for all type of streams.
3. Map Interfaces: All Map classes has forEach() for iterating elements from map.

Syntax of forEach() menthod
```bash
default void forEach(Consumer<? super T> action);

To invoke

reference.forEach(argument);

```
Example with List
```bash
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

```

OutPut:
```bash
ForEach with LIST
Enahanced for loop
Tiger
Lion
Cat
dog
For Each method with Lambda Expression
Tiger
Lion
Cat
dog
For Each method with method reference
Tiger
Lion
Cat
dog
```
refer java code for more examples





