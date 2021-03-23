package com.testing;

public class Pat34
{
	public static void main(String args[])
	{
		for(int a=1;a<=5;a++)
		{
			for(int c=1;c<=2*(5-a);c++)
			{
				
				
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++)
			{
				char ch='A';
				ch+=b-1;
				System.out.print(ch+" ");
			}
			
			for(int b=a-1;b>=1;b--)
			{
				char ch='A';
				ch+=b-1;
				System.out.print(ch+" ");
				
			}
			System.out.println();
		}
	}
}
