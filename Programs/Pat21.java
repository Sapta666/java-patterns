package com.testing;

public class Pat21 
{
	public static void main(String args[])
	{
		int t=(int)'A';
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print((char)t+" ");
				t++;
			}
			System.out.println();
		}
	}
}
