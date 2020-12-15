/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
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
		int t=obj.nextInt();
		while(t-->0)
		{
			int n=obj.nextInt();
			long x=obj.nextLong();
			
			int []a=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=obj.nextInt();
			}
			Arrays.sort(a);
			if(x>=a[n-1])
			{
				System.out.println(n);
			}
			else
			{
				long ans=0;
				int i=0;
				int count=0;
				while(a[i]<x)
				{
					i++;
					count++;
				}
				if(count!=0)
				{
					if(a[count-1]*2>=x)
					{
						x=a[count-1]*2;
						ans+=count;
						count=0;
					}
				}
				for(int j=i;j<n;j++) 
				{
					long g=a[j];
					long zp=g;
					while(x<g)
					{
						x=x*2;
						ans++;
					}
					ans=ans+1;
					x=zp*2;
				
				}
				System.out.println(ans+count);
			}
		}
	}
}
