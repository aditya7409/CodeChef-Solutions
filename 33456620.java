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
			int []a=new int[6];
			int i;
	
			for(i=0;i<6;i++)
			{
				a[i]=obj.nextInt();
			}
			
			int sum=0;
			int p=a[5];
			
			for(i=0;i<5;i++)
			{
				sum+=(a[i]*p);
			}
			
			if(sum<=120)
			{
				System.out.println("No");
			}
			else
			{
				System.out.println("Yes");
			}
	}
}
}