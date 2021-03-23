package com.testing;

public class Pat23 
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
				char ch='A';
				
				ch+=(t%10)-1;
				
				System.out.print(ch+" ");
				t/=10;
			}
			System.out.println();
		}
	}
}
