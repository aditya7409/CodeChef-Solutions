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
		
		int t=obj.nextInt();
		
		while(t-->0)
		{
			int n=obj.nextInt();
			int h=n;
			h--;
			HashMap<Integer,Integer> map=new HashMap<>();
			while(h-->0)
			{
				int parent =obj.nextInt();
				
				int child=obj.nextInt();
				
				Integer k=map.get(child);
				map.put(child, (k==null)?1:k+1);
			}
			int []a=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=map.getOrDefault(i+1, 0);
			}
			int count0=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]==0)
				{
					count0++;
				}
			}
			count0-=1;
			System.out.println(count0);
		}
	}
}
