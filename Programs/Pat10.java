package com.testing;

public class Pat10 
{
	public static void main(String args[])
	{
		int t=(int)'E';
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=5-a;b++)
			{
				System.out.print(" ");
			}
			for(int c=t;c>=t-a+1;c--)
			{
				System.out.print((char)c+" ");
			}
			System.out.println();
		}
	}
}
