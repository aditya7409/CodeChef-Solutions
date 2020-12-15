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
			
			long []a=new long[n];
			
			long tie=0;
			
			for(int i=0;i<n;i++)
			{
				a[i]=obj.nextLong();
			}
			long max=Long.MIN_VALUE;
			for(int i=0;i<n;i++)
			{
				if(a[i]>max)
				{
					max=a[i];
				}
			}
			long countMax=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]==max)
				{
					countMax++;
				}
			}
			if(countMax%2==1)
			{
				tie=0;
			}
			else
			{
				tie=((long)Math.pow(2, n-countMax)*Binomial(countMax,1000000007))%1000000007;
			}
			long ans=(long)Math.pow(2,n)-tie;
			ans+=1000000007;
			System.out.println(ans%1000000007);
		}
	}

  
    public static long Binomial(long n,long m)
    {
    	long x=1;
    	long y=1;
    	
    	for(int i=0;i<n/2;i++)
    	{
    		x=(x*(n-i))%m;
    		y=(y*(i+1))%m;
    	}
    	return (x*power(y,m-2,m))%m;
    }
     
	public static long power(long x, long y, long p) 
    { 
        
        long res = 1;      
         
       
        x = x % p;  
  
       if (x == 0) return 0;     
  
        while (y > 0) 
        { 
            
            if((y & 1)==1) 
                res = (res * x) % p; 
      
           
            y = y >> 1;  
            x = (x * x) % p;  
        } 
        return res; 
    } 
}
