/* package codechef; // don't place package name! */

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
					long s,n;
					s=obj.nextLong();
					n=obj.nextLong();
					long answer=0;
					if(s==1)
					{
						answer=1;
						
					}
					else
					{
					if(s%n==0)
					{
						answer=s/n;
						
					}
					else if(s%n==s)
					{
						if(s%2==0)
						{
							answer=1;
						}
						else {
							answer=2;
						}
					}
					else
					{
						long coins=s/n;
						long rem=s%n;
						
						if(rem%2==0)
						{
							answer=coins+1;
						}
						else if(s-coins*n==1)
						{
							answer=coins+1;
						}
						else
						{
							answer=coins+2;
						}
					}
					}
					System.out.println(answer);
				}
				
		}
		catch(Exception e)
		{
			return;
		}

	}
}
