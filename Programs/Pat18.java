package com.testing;

public class Pat18 
{
	public static void main(String args[])
	{
		int t=(int)'A';
		for(int a=1;a<=5;a++)
		{
			for(int b=t;b<=t+5-a;b++)
			{
				System.out.print((char)b+" ");
			}
			System.out.println();
		}
	}
}
