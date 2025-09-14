package com.tnsif.primenumb;

public class primeornot {

	public static void main(String[] args) {
		int count=0;
		int num=2;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println(num+" "+"it is a prime number");
		}
		else
		{
			System.out.println(num +" "+"It is not a prime Number");
		}

	}

}
