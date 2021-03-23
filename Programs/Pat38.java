package com.testing;

public class Pat38
{
	public static void main(String args[])
	{
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=5-a;b++)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		for(int a=1;a<=5-1;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=5-a;b++)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}
