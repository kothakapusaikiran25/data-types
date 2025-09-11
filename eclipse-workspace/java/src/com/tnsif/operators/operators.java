package com.tnsif.operators;

public class operators {

	public static void main(String[] args) {
		int a = 10, b = 5;
		
		System.out.println("Arthemetic operator : ");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		System.out.println("Relational Operators :");
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		System.out.println("Logical Operators :");
		boolean x = true,y = false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		
		System.out.println("unary Operator: ");
		int d = 5;
		System.out.println(d++);
		System.out.println(++d);
		System.out.println(d--);
		System.out.println(--d);
		
		System.out.println("Assignment Operators : ");
		int c = a;
		c = c + b;
		System.out.println(c);
		c = c - b;
		System.out.println(c);
		c = c * b;
		System.out.println(c);
		c = c / b;
		System.out.println(c);
		c = c % b;
		System.out.println(c);
		
		System.out.println("Bitwise Operators : ");
		int p = 6,q = 4;
		System.out.println(p & q);
		System.out.println(p | q);
		System.out.println(p ^ q);
		System.out.println(~p);
		System.out.println(p << q);
		System.out.println(p >> q);
		
		

	}

}
