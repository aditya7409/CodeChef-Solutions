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
		
		
		
		
			int r=obj.nextInt();
			int c=obj.nextInt();
			
			if(r==1)
			{
				for(int i=1;i<=r;i++)
				{
					System.out.print("U");
				}
				int val=r*c-1;
				for(int i=1;i<=val;i++)
				{
					System.out.print("R");
				}
//				System.out.println();
			}
			else
			{
				int row=r/2;
				while(row-->0)
				{
					System.out.print("U");
					for(int i=1;i<=c-1;i++)
					{
						System.out.print("R");
					}
					System.out.print("D");
					for(int i=1;i<=c-1;i++)
					{
						System.out.print("L");
					}
					//System.out.println("U");
				}
				if(r%2==1)
				{
					System.out.print("U");
					for(int i=1;i<=r-1;i++)
					{
						System.out.print("R");
					}
				}
			}
		
	}
}
