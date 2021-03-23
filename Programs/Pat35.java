package com.testing;

public class Pat35 
{
	
	public static void main(String args[])
	{
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=a-1;b++)
			{
				System.out.print("0 ");
			}
			
			System.out.print(a+" ");
			
			for(int c=1;c<=5-a;c++)
			{
				System.out.print("0 ");
			}
			System.out.println();
		}
	}
}
