package com.testing;

public class Pat20
{
	public static void main(String args[])
	{	
		for(int a=1;a<=5;a++)
		{
			int t=(int)'E';
			for(int b=1;b<=a;b++)
			{
				System.out.print((char)t+" ");
				t--;
			}
			System.out.println();
		}
	}
}
