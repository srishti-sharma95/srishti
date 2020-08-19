package com.udemy;

import java.util.Arrays;;

public class ControllFlow {

	static boolean ifStatement(int a,int sal) {
		boolean approved = false;
		
		int age = a;
		int salary = sal;
		
		if (age >= 25 && age <= 35 && salary >= 50000) {		
			approved = true;            			
			System.out.println("age >= 25 && age <= 35 && salary >= 50000");
		} else if (age > 35 && age <= 45 && salary >= 70000) {
			approved = true;			
			System.out.println("age > 35 && age <= 45 && salary >= 70000");
		} else if (age > 45 && age <= 55 && salary >= 90000) {
			approved = true;			
			System.out.println("age > 45 && age <= 55 && salary >= 90000");
		} else {
		    if (age > 55) {
				approved = false;			
				System.out.println("age > 55");
			}
		    else if(age < 25) {
				approved = false;			
				System.out.println("age < 25");
			}
		    else{
		    	System.out.println("Low salary < 50000");
		    }
					}
		
		return approved;
	}
	
	public static void swap() {
		  int[] arr={1,2,3,4,5,6,7,8};
		  int k;
		  for(int i=0;i<arr.length;i++)
		  {
			  
			  System.out.print(arr[i]+" ");
	    }  
		  for(int i=0, j=arr.length-1; i<=j;i++,j--)
		  {
			  k=arr[i];
			  arr[i]=arr[j];
			  arr[j]=k;
		  }
		  System.out.println("\nAfter Swap...");
		  for(int i=0;i<arr.length;i++)
		  {
			  
			  System.out.print(arr[i]+" ");
	    } 
	}
	
	public static void main(String[] args) {	
		  // Language Basics 1
		  /*
		  System.out.println("Age=30, Sal=20000");
		  System.out.print(" Is Approved:  "+ifStatement(30,20000));
		  System.out.println("\nAge=28, Sal=60000");
		  System.out.print(" Is Approved:  "+ifStatement(28,60000));
		  System.out.println("\nAge=20, Sal=70000");
		  System.out.print(" Is Approved:  "+ifStatement(20,70000));*/
		//int j=1;
		  /*for (int i=1; i<5;i++)
		  {
			  System.out.println("hi");
		  }*/
//		  for(j=0, double d=10.0;j<3 && d <10.9;j++)
//		  {
//			  System.out.println("hello");
//		  }
		swap();
		
	}

}
