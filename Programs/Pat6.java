package com.testing;

public class Pat6 {

	public static void main(String[] args) 
	{
		for(int a=1;a<=5;a++)
		{
			for(int c=1;c<=2*(5-a);c++)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}

}
