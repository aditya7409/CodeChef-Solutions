/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
     //	Template For Fast i/o copied From Gfg
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
 
	public static void main(String[] args) {
		
		FastReader obj=new FastReader();
		
		int m=obj.nextInt();
		
		while(m-->0)
		{
			int n=obj.nextInt();
			
			int []a=new int[n];
			
			for(int i=0;i<n;i++)
			{
				a[i]=obj.nextInt();
			}
			int []b=new int[n];
			int max=Integer.MIN_VALUE;
			int min=Integer.MAX_VALUE;
			for(int i=0;i<n;i++)
			{
				if(a[i]>max)
				{
					max=a[i];
				}
				for(int j=i+1;j<n;j++)
				{
					if(a[j]<max)
					{
						b[i]++;
					}
				}
			}
			for(int i=n-1;i>=0;i--)
			{
				if(a[i]<min)
				{
					min=a[i];
				}
				for(int j=i-1;j>=0;j--)
				{
					if(a[j]>min)
					{
						b[i]++;
					}
				}
			}
			int gMax=Integer.MIN_VALUE;
			int gmin=Integer.MAX_VALUE;
			for(int i=0;i<n;i++)
			{
				if(b[i]>gMax)
				{
					gMax=b[i];
				}
			}
			for(int i=0;i<n;i++)
			{
				if(b[i]<gmin)
				{
					gmin=b[i];
				}
			}
			System.out.println((gmin+1)+" "+(gMax+1));
		}
	}	
}
