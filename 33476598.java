/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		
		int t=obj.nextInt();
		
		while(t-->0)
		{
			int n=obj.nextInt();
			int i;
			int []a=new int[n];
			for(i=0;i<n;i++)
			{
				a[i]=obj.nextInt();
			}
			
			int []b=new int[n];
			
			for(i=0;i<n;i++)
			{
				b[i]=obj.nextInt();
			}
			long sum1=0,sum2=0;
			long distance=0;
			for(i=0;i<n;i++)
			{
				sum1+=a[i];
				sum2+=b[i];
				
				if(a[i]==b[i] && sum1==sum2)
				{
					distance+=a[i];
				}
			}
			System.out.println(distance);
		}
	}
}
