/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		try {
			
				FastReader obj=new FastReader();
				
				int t=obj.nextInt();
				
				while(t-->0)
				{
					long m,tc,th;
					m=obj.nextLong();
					tc=obj.nextLong();
					th=obj.nextLong();
					
					if(th==tc)
					{
						System.out.println("No");
					}
					else {
						long dif=th-tc;
						if(dif%3==0)
						{
							long rem=dif/3;
							if(rem<=m)
							{
								System.out.println("No");
							}
							else
							{
								System.out.println("Yes");
							}
						}
						else
						{
							System.out.println("Yes");
						}
					}
				}
		}
		catch(Exception e)
		{
			return;
		}

	}
}
