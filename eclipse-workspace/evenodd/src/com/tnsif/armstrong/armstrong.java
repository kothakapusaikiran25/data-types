package com.tnsif.armstrong;

public class armstrong {

	public static void main(String[] args) {
		int num=153;
		
		int original = num;
		
		int sum=0;
		
		while(num > 0)
		{
			int digit =num % 10;
			sum =sum + (digit * digit * digit );
			num=num/10;
			
		}
		
		if(sum==original)
		{
			System.out.println(original+" is a armstrong");
		}
		else
		{
			System.out.println(original+" is not armstrong");
		}

	}

}
