package com.testing;

public class Pat24 
{
	public static void main(String args[])
	{
		
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		for(int a=1;a<=4;a++)
		{
			for(int b=1;b<=4-a+1;b++)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		
		
	}
	
}
