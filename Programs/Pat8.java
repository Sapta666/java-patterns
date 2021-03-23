package com.testing;

public class Pat8 
{
	public static void main(String args[])
	{
		for(int a=5;a>=1;a--)
		{
			for(int b=a;b>1;b--)
			{
				System.out.print(" ");
			}
			for(int c=5;c>=a;c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
