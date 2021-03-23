package com.testing;

public class Pat16
{
	public static void main(String args[])
	{
		for(int a=1;a<=5;a++)
		{
			for(int b=5;b>=5-a+1;b--)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}
