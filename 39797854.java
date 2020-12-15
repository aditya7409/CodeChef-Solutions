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
		    String a=obj.next();
		    String b=obj.next();
		    if(a.equals(b))
		    {
		        System.out.println("0");
		    }
		    else
		    {
		        int l=0,r=0;
    		    for(int i=0;i<a.length();i++)
    		    {
    		        if(a.charAt(i)!=b.charAt(i))
    		        {                                         
    		            l=i;
    		            break;
    		        }
    		    }
    		    for(int i=a.length()-1;i>=0;i--)
    		    {
    		        if(a.charAt(i)!=b.charAt(i))
    		        {
    		            r=i;
    		            break;
    		        }
    		    }
    
    		    if(l==r)
    		    {
    		        System.out.println("1");
    		    }
    		    else
    		    {
    		        int ans=0;
    		        char[]aa=a.toCharArray();
    		        char[]bb=b.toCharArray();
    		        for(int i=l;i<=r;i++)
    		        {
    		            if(aa[i]!=bb[i])
    		            {
    		                                                      //0000
                                                                  //1011
    		                int j=i;
    		                while(j<=r && aa[j]!=bb[j])
    		                {
    		                    aa[j]=bb[j];
    		                    j+=2;
    		                }
    		                ans++;
    		              //  System.out.println(ans);
    		            }
    		        }
    		        System.out.println(ans);
    		    }
		    }
		}
	}
}
