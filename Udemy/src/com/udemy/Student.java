package com.udemy;

class Student {
	  //float gpa= 3.8f;//for float its imp to put f at end.
	  //double gpa = 3.8;
	static int studentCount=0;
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
	
	
    // Constructors
    Student(int id, String name) {
        this(name); // Invoking overloaded constructor. If present, should be first statement
	this.id = id;
	this.gender="Male";
    }
	
    Student(String name) {
	this.name = name;
    }
	
    // method definitions
    boolean updateProfile(String name) {
        this.name = name;
        return true;
    }
		  
	Student(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, 
	 char newDegree, boolean isInternational) {
		id = newId;
		name = newName;
		gender = newGender;
		age = newAge;
		phone = newPhone;
		gpa = newGpa;
		degree = newDegree;
		international = isInternational;
		  
		studentCount = studentCount + 1;		  
		  
		if (international) {
			tuitionFees = tuitionFees + internationalFees;
			return;
		 }	
		//System.out.println("\n\ninternational false");
		for(int i = 2;i<=0;i--)
		{
			System.out.println("\n\test: "+i);
			return;
		}
		System.out.println("\n\ninternational false");
	}
	
	void dispayDetails()
	{
		System.out.println("\nid: " + this.id);
		System.out.println("name: " + this.name);
		System.out.println("gender: " + this.gender);
		System.out.println("age: " + this.age);
		System.out.println("phone: " + this.phone);
		System.out.println("gpa: " + this.gpa);
		System.out.println("degree: " + this.degree);
		System.out.println("tuitionFees: " + this.tuitionFees);
		System.out.println("studentCount: " + Student.studentCount);
	}
	
				
	public static void main(String[] args) {

		  Student student1 = new Student(1001, "Prateek Sharma", "Male", 21, 223_456_9999L, 3.4, 'M', true);
		  student1.dispayDetails();
		  Student student2 = new Student(1002, "Srishti Sharma", "Female", 25, 223_456_8888L, 4.0, 'F', false);
		  student2.dispayDetails();
		  
	  }
}