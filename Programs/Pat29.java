package com.testing;

public class Pat29
{
	public static void main(String args[])
	{
		for(int a=1;a<=5;a++)
		{
			for(int b=5-a+1;b>=1;b--)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
		for(int a=1;a<=5-1;a++)
		{
			for(int b=1;b<=a+1;b++)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}
