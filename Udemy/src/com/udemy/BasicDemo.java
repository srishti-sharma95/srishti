package com.udemy;
import java.math.BigDecimal;

class BasicDemo {
    // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
    static void print() {
        System.out.println("\n\nInside print ...");
        System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
        System.out.println();                 // Print empty line
        System.out.print("Hello, world!!");   // Cursor stayed after the printed string
        System.out.println("Hello,");
        System.out.print(" ");                // Print a space
        System.out.print("world!!");
    }
	  /*
	  static void primitives() {
	      System.out.println("\n\nInside primitives ...");
		  int intHex = 0x0041; // 16 power 0 * 1 + 16 power 1 * 4
		  System.out.println("intHex: " + intHex);
		  
		  // Java 7
		  int intBinary = 0b0100_0001;
		  System.out.println("intBinary: " + intBinary);
		  
		  int intOctal = 0101;
		  System.out.println("intOctal: " + intOctal);
	  }*/
	  static void primitives() {
	      System.out.println("\n\nInside primitives ...");
		  int intHex = 0x0041; // 16 power 0 * 1 + 16 power 1 * 4
		  System.out.println("intHex: " + intHex);
		  
		  // Java 7
		  int intBinary = 0b0100_0001;
		  System.out.println("intBinary: " + intBinary);
		  
		  int intOctal = 0101;
		  System.out.println("intOctal: " + intOctal);	
		  
		  int intChar = 'A';
		  System.out.println("intChar: " + intChar);

          char charInt = 65;
		  System.out.println("charInt: " + charInt);	
		  
		  //char charHex = 0x0041;
		  char charHex = 0x0046;
		  System.out.println("charHex: " + charHex);	
		  
		  //char charBinary = 0b0100_0001;
		  char charBinary = 0b0100_0110;
		  System.out.println("charBinary: " + charBinary);	
	  }

	    static void typeCasting() {
	      System.out.println("\nInside typeCasting ...");
	      // Explicit casting
	      long y = 42;
	      //int x = y;
	      int x = (int)y;
	      
	      // Information loss due to out-of-range assignment
	      byte narrowdByte = (byte)123456;
		  System.out.println("narrowdByte: " + narrowdByte); 
		  
		  // Truncation
		  int iTruncated = (int)0.99;
		  System.out.println("iTruncated: " + iTruncated); 
		  
		  // Implicit cast (int to long)
		  y = x;
		  
		  // Implicit cast (char to int)
		  char cChar = 'A';
		  int iInt = cChar; 
		  System.out.println("iInt: " + iInt);
		  
		  // byte to char using an explicit cast
		  byte bByte = 65;
		  cChar = (char)bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
		  System.out.println("cChar: " + cChar);
	    }
		
		static void arrays() {
		   System.out.println("\nInside arrays ...");
		   int[] myArray = new int[]{9, 11, 2, 5, 4, 4, 6};
	       System.out.println("myArray.length: " + myArray.length);
		   System.out.println("myArray[1]: " + myArray[1]);
		   System.out.println("myArray[7]: " + myArray[7]);	   
		}

	    static void threeDimensionalArrays() {
		   System.out.println("\nInside threeDimensionalArrays ...");
		   int[][][] unitsSold = new int[][][]{ 
											   { // New York
												 {0,0,0,0}, // Jan
												 {0,0,0,0}, // Feb
												 {0,0,0,0}, // Mar
												 {0,850,0,0}// Apr	
											   },
											   { // San Francisco
												 {0,0,0,0}, // Jan
												 {0,0,0,0}, // Feb
												 {0,0,0,0}, // Mar
												 {0,0,0,0}  // Apr
											   },
											   { 
												 {0,0,0,0},
												 {0,0,0,0},
												 {0,0,0,0},
												 {0,0,0,0}
											   },
											   {
												 {0,0,0,0},
												 {0,0,0,0},
												 {0,0,0,0},
												 {0,0,0,0}
											   }
											 };
			                    	 
			System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
		}	
		
		static void varargsOverload(boolean b, int i, int j, int k){
		   System.out.println("\nInside varargsOverload without varargs ...");
		}
		static void varargsOverload(boolean b, int... list){
		   System.out.println("\nInside varargsOverload with varargs ...");
		   System.out.println("list.length: " + list.length);
		}

		static void charTypePromotion() {
		  System.out.println("\nInside charTypePromotion ...");
		  char char1 = 50; // Will be assigned corresponding UTF16 value 2
		  System.out.println("char1: " + char1); 
		  System.out.println("(73 - char1): " + (73 - char1)); // char1 gets promoted to int, i.e., decimal equivalent 50 in UTF16 is used	  
		  System.out.println("(char1 - '3'): " + (char1 - '3')); // char1 & '3' are promoted to ints	
		  System.out.println("('a' + 'b'): " + ('a' +'b')); // 'a' & 'b' are promoted to ints and the respective equivalents 97 & 98 are added
	    }
		
		
		// Comparison or Relational operators
		static void comparisonOperators() {
			int age = 20;
		    /*if (age > 21) {
				System.out.println("Graduate student");
			}*/
			System.out.println("age > 21: " + (age > 21));
			System.out.println("age >= 21: " + (age >= 21));  
			System.out.println("age < 21: " + (age < 21));
			System.out.println("age <= 21: " + (age <= 21));	  
			System.out.println("age == 21: " + (age == 21)); // equal to (equality operator)
			System.out.println("age != 21: " + (age != 21)); // not equal to (equality operator)
			
			boolean isInternational = true;
			//System.out.println("isInternational <= true: " + (isInternational <= true));  
			System.out.println("isInternational == true: " + (isInternational == true)); 
			System.out.println("isInternational != true: " + (isInternational != true));
			
			Student s1 = new Student(1000, "Dheeru");
			Student s2 = new Student(1000, "Dheeru");
			System.out.println("s1 == s2: " + (s1 == s2)); // See object class
			System.out.println("s1 != s2: " + (s1 != s2));
			
			System.out.println("Update S1:  "+update(s1, "John"));
			System.out.println("Update S:  "+update(null, "John"));
		}		
		
		static boolean update(Student s, String name) {
		    if (s == null) {
			   return false;
			}
			
			s.name = name;
			return true;
		}
		static void logicalOperators(int sal) {
			System.out.println("\nInside logicalOperators ...");
			int age = 37;
		    int salary = sal;
		    boolean hasBadCredit = false;
			
			// 1. Core (AND, OR, NOT & Operator Chaining)
		    
		    if (age > 35 && salary > 9000*10 || !hasBadCredit) {
		    	System.out.println("Salary: "+salary);
		    	System.out.println("Loan approved!");
		    } else {
				System.out.println("Loan not approved!");
			}
			
			// 2. 
			//    (a) Left-associative ~ Order of grouping
			//    (b) Associativity (a && b) && c = a && (b && c)
			//    Applies to both && and ||
			
			
			// 3. 
			//    (a) Operator precedence of Logical Operators: Helps with ONLY grouping operations. Not order of execution. (! > && > ||)
			
			          // Other Examples: A && B || C && D = (A && B) || (C && D)
					  //                 A && B && C || D = ((A && B) && C) || D
			
			
			//    (b) Operator Precedence across logical, comparison and arithmetic
			//          ! > arithmetic > comparison > &&, ||
			//    See resources section for complete precedence rules
			
			// ALWAYS USE PARENTHESIS for READABILITY. Not everyone is aware of precedence rules
			
			// 4. Use && to avoid NullPointerException
			Student s1 = new Student(1001, "Raj");
			update(s1, "Dheeru");
		}
		
		static void bitwiseOperators() {
		    System.out.println("\nInside bitwiseOperators ...");
		    int x = 1;
			int y = 3;
			
			System.out.println("x & y: " + (x & y));
			System.out.println("x | y: " + (x | y));
			System.out.println("x ^ y: " + (x ^ y));
			System.out.println("~x: " + (~x));
			System.out.println("true & false: " + (true & false));
			 
			char c1 = 'a'; // U+0061 --> 0110 0001
			char c2 = 'b'; // U+0062 --> 0110 0010
			System.out.println("c1 | c2: " + (c1 | c2)); // 0110 0011 --> 99 in decimal		
			
			// Since bitwise work only on Integer types, following will not compile
			//double d1 = 3.14;
			//double d2 = 5.15;
			//System.out.println("d1 | d2: " + (d1 | d2));
	  }
		
		static void switchExample() {
		    System.out.println("\nInside switchExample ...");
		    int month = 3;
		    switch (month) {
			    case 1: System.out.println("January");
		                break;
			    case 2: System.out.println("February");
		                break;
		        case 3: System.out.println("March");
		                break;
			    default: System.out.println("April");
		    }
	    }
	  
	    static void labeledBreak() {
		    System.out.println("\nInside labeledBreak ...");
		    int num = 0;
			
		    outermost: for (int i = 0; i < 10; i++) {
		        for (int j = 0; j < 10; j++) {    
		            if (i == 5 && j == 5) {
		                break outermost;
		            }
		            num++;
		        }
		    }
			
		    System.out.println("num: " + num); // prints 55		
	    }
		
		static void labeledContinue() {
		    System.out.println("\nInside labeledContinue ...");
		    int num = 0;
			
		    outermost: for (int i = 0; i < 10; i++) {
		        for (int j = 0; j < 10; j++) {    
		            if (i == 5 && j == 5) {
		                continue outermost;
		            }
		            num++;
		        }
		    }
			
		    System.out.println("num: " + num); // prints 55		
	    }

	 	  public static void main(String[] args) {	
	          // Language Basics 1
			  //print();				
			  //primitives();
			  //typeCasting();
			  //arrays();	
		      //threeDimensionalArrays();
	   /* System.out.println(1 - 0.9);
		  System.out.println(0.1 + 0.2);
		  // 0.1 ~ 0.00011001100110011001100110011001100110011001100110011001100110011
		  
		  double price = 1000;
		  double discountPercent = 0.9;
		  double discountAmount = price * discountPercent;
		  System.out.println(price - discountAmount);
		  System.out.println(price * (1 - discountPercent));
		  
		  BigDecimal first = new BigDecimal("0.1");
		  BigDecimal second = new BigDecimal("0.2");
		  System.out.println(first.add(second));
		  primitives();
	
	      varargsOverload(true, 1, 2, 3);
	      varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8);	  
	      varargsOverload(true);
	      charTypePromotion();  
	 	  comparisonOperators(); 
	 	  logicalOperators(900);
	 	  logicalOperators(90);  
	 		  bitwiseOperators();
	 		  switchExample();
	 		  */
	 		 labeledContinue();
	  }       
}