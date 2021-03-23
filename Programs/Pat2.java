package com.testing;

public class Pat2 {

	public static void main(String[] args)
	{
		int c=(int)'A';
		for(int a=1;a<=5;a++)
		{
			c=(int)'A';
			for(int b=1;b<=a;b++)
			{
				System.out.print((char)c+" ");
				c++;
			}
			System.out.println();
		}
	}

}
