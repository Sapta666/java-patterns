package com.testing;

public class Pat22 
{
	public static void main(String args[])
	{
		int t=1;
		
		for(int a=1;a<=5;a++)
		{
			t=(int)Math.pow(11,a-1);
			
			for(int b=1;b<=5-a;b++)
			{
				System.out.print(" ");
			}
			
			while(t>0)
			{
				System.out.print(t%10+" ");
				t/=10;
			}
			System.out.println();
		}
	}
}
