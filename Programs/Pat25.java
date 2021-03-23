package com.testing;

public class Pat25 
{
	public static void main(String args[])
	{
		
		
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=a;b++)
			{
				char ch='A';
				
				ch+=b-1;
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		
		for(int a=1;a<=4;a++)
		{
			for(int b=1;b<=4-a+1;b++)
			{
				char ch='A';
								
				ch+=b-1;
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		
		
		
	}
	
}
