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
 
 (arguments) -> {//implemenation logic}

There are 3 types of lambda expression paramters as below,

1. Zero or default parameter
2. one parameter
3. mutiple parameter(morethan one parameter)

Zero/default Parameter:

() -> {
       //implementation Logic
	   System.out.println("Lambda zero parameter");
      }
	  
One Parameter:

(data) -> {
       //implementation Logic
	   System.out.println("Lambda expression with one parameter as " +data);
      }
	  
Multiple Parameters:

(name,age) -> {
       //implementation Logic
	   System.out.println("Lambda expression with multiple parameter as " + data + "," + age);
      }
Refere sample code for more info..


### 2. forEach() for Iterating Collection

forEach() method is a Java 8 new feature and this method is used for iterating data from collections.

