package com.testing;

public class Pat31 
{
	public static void main(String args[])
	{
		for(int a=1;a<=5;a++)
		{
			for(int b=5-a+1;b>=1;b--)
			{
				char ch='A';
				ch+=b-1;
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		for(int a=1;a<=5-1;a++)
		{
			for(int b=a+1;b>=1;b--)
			{
				char ch='A';
				ch+=b-1;
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}
