package com.udemy;

/*
	Instance & Static:
	- Declared at class-level 
	- Scope: Entire class
	- Gets default value
	- Cannot be re-initialized directly within class

	Instance: Represents object state

	- Values are unique to object
	- From outside class: Accessible via object reference

	Static:
	 
	- Values are unique to class ~ One copy per class (shared across objects)
	- From outside class: Accessible via Class Name or object reference

	Instance & static variables are also referred to as fields or attributes. Attributes is probably more commonly associated with instance variables. 
*/

class Student2 {
    static int computeCount;
	  
    int id;
	  String name;
	  String gender;
	  int age;
	  long phone;	  
	  double gpa;	  
	  char degree;
	  
	  boolean international;
	  double tuitionFees = 12000.0;
	  double internationalFees = 5000.0;
	
	  void compute() {	
 	      computeCount = computeCount + 1;
		  int nextId = id + 1;		  
		  
		  if (international) {
		      tuitionFees = tuitionFees + internationalFees;
		  }
		
	      System.out.println("\nid: " + id);
		  System.out.println("nextId: " + nextId);
		  System.out.println("name: " + name);
		  System.out.println("gender: " + gender);
		  System.out.println("age: " + age);
		  System.out.println("phone: " + phone);
		  System.out.println("gpa: " + gpa);
		  System.out.println("degree: " + degree);
		  
		  System.out.println("Is International: "+international);
		  System.out.println("tuitionFees: " + tuitionFees);
		  System.out.println("computeCount: " + computeCount);
	  }
	  
	
	  public static void main(String[] args) {
	      Student2 Student21 = new Student2();
		  Student21.id = 1000;	
	      Student21.name = "Manoj";
	      Student21.gender = "male";
	      Student21.age = 18;
	      Student21.phone = 223_456_7890L;	  
	      Student21.gpa = 3.8;	  
	      Student21.degree = 'B';	  
	      Student21.international = false;
		  Student21.compute();
		  
		  Student2 Student22 = new Student2();
		  Student22.id = 1001;	
	      Student22.name = "Prateek";
	      Student22.gender = "male";
	      Student22.age = 21;
	      Student22.phone = 223_456_9999L;	  
	      Student22.gpa = 3.4;	  
	      Student22.degree = 'M';	  
	      Student22.international = true;
		  //Student22.compute();
		  
		  Student2 Student23 = new Student2();
		  Student23.id = 1002;
		  Student23.name = "Srishti";
		  Student23.gender = "female";
		  Student23.age = 20;
		  Student23.phone = 223_456_8888L;
		  Student23.gpa = 4.0;
		  Student23.degree = 'M';
		  Student23.international = true;
		 Student23.compute();
		  
		  System.out.println("Student2.computeCount: " + Student2.computeCount);
	  }
}
