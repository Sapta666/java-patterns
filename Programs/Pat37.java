package com.testing;

public class Pat37 
{
	public static void main(String args[])
	{
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=5-a;b++)
			{
				
				
				System.out.print("A ");
			}
			for(int c=1;c<=a;c++)
			{
				char ch='A';
				ch+=a-1;
				
				System.out.print(ch+" ");
			}
			System.out.println();
		}
			
	}

}
