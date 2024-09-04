package com.tns.day1;

public class FIRSTPROGRAMM {

	public static void main(String[] args) {
		 System.out.print("Enter the first number: ");
	        int num1 = 5;

	        System.out.print("Enter the second number: ");
	        int num2 = 10;

	        // Arithmetic Operators
	        System.out.println("Arithmetic Operators:");
	        System.out.println("Addition (num1 + num2): " + (num1 + num2));
	        System.out.println("Subtraction (num1 - num2): " + (num1 - num2));
	        System.out.println("Multiplication (num1 * num2): " + (num1 * num2));
	        System.out.println("Division (num1 / num2): " + (num2 != 0 ? (num1 / num2) : "undefined (division by zero)"));
	        System.out.println("Modulus (num1 % num2): " + (num2 != 0 ? (num1 % num2) : "undefined (division by zero)"));

	        // Relational Operators
	        System.out.println("\nRelational Operators:");
	        System.out.println("Equal to (num1 == num2): " + (num1 == num2));
	        System.out.println("Not equal to (num1 != num2): " + (num1 != num2));
	        System.out.println("Greater than (num1 > num2): " + (num1 > num2));
	        System.out.println("Less than (num1 < num2): " + (num1 < num2));
	        System.out.println("Greater than or equal to (num1 >= num2): " + (num1 >= num2));
	        System.out.println("Less than or equal to (num1 <= num2): " + (num1 <= num2));

	        // Logical Operators
	        boolean bool1 = true, bool2 = false;
	        System.out.println("\nLogical Operators:");
	        System.out.println("AND (bool1 && bool2): " + (bool1 && bool2));
	        System.out.println("OR (bool1 || bool2): " + (bool1 || bool2));
	        System.out.println("NOT (!bool1): " + (!bool1));

	        // Bitwise Operators
	        System.out.println("\nBitwise Operators:");
	        System.out.println("Bitwise AND (num1 & num2): " + (num1 & num2));
	        System.out.println("Bitwise OR (num1 | num2): " + (num1 | num2));
	        System.out.println("Bitwise XOR (num1 ^ num2): " + (num1 ^ num2));
	        System.out.println("Bitwise Complement (~num1): " + (~num1));
	        System.out.println("Left shift (num1 << 2): " + (num1 << 2));
	        System.out.println("Right shift (num1 >> 2): " + (num1 >> 2));
	        System.out.println("Unsigned right shift (num1 >>> 2): " + (num1 >>> 2));

	        // Assignment Operators
	        System.out.println("\nAssignment Operators:");
	        int assign = num1;
	        System.out.println("Assign (=): " + assign);
	        assign += num2;  // assign = assign + num2
	        System.out.println("Add and assign (+=): " + assign);
	        assign -= num2;  // assign = assign - num2
	        System.out.println("Subtract and assign (-=): " + assign);
	        assign *= num2;  // assign = assign * num2
	        System.out.println("Multiply and assign (*=): " + assign);
	        if (num2 != 0) {
	            assign /= num2;  // assign = assign / num2
	            System.out.println("Divide and assign (/=): " + assign);
	            assign %= num2;  // assign = assign % num2
	            System.out.println("Modulus and assign (%=): " + assign);
	        } else {
	            System.out.println("Division by zero is not allowed for assignment operators.");
	        }

	        // Unary Operators
	        System.out.println("\nUnary Operators:");
	        System.out.println("Unary plus (+num1): " + (+num1));
	        System.out.println("Unary minus (-num1): " + (-num1));
	        int preIncrement = ++num1;
	        System.out.println("Pre-increment (++num1): " + preIncrement);
	        int postIncrement = num1++;
	        System.out.println("Post-increment (num1++): " + postIncrement + " (num1 now: " + num1 + ")");
	        int preDecrement = --num1;
	        System.out.println("Pre-decrement (--num1): " + preDecrement);
	        int postDecrement = num1--;
	        System.out.println("Post-decrement (num1--): " + postDecrement + " (num1 now: " + num1 + ")");

	        // Closing the scanner
	       
	        
	    }
	}