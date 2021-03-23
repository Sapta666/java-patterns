package com.testing;

public class Pat13 
{
	public static void main(String args[])
	{
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=5-a;b++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=a;c++)
			{
				int t=(int)'A'+a-1;
				
				System.out.print((char)t+" ");
			}
			System.out.println();
		}
	}
}
