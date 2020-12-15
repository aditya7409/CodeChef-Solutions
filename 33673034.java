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
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader obj=new FastReader();
		int t=obj.nextInt();
		
		while(t-->0)
		{
			int n=obj.nextInt();
			
			int []a=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=obj.nextInt();
			}
			int [] coins=new int[20];
			String ans="YES";
			if(a[0]!=5)
			{
				ans="NO";
			}
			else
			{
				coins[5]++;
				for(int i=1;i<n;i++)
				{
					int c=a[i]-5;
					if(c==5)
					{
						if(coins[5]>=1)
						{
						    coins[5]--;
						    coins[10]++;
						}
						else
						{
						    ans="NO";
						    break;
						}
					}
					else if(c==10)
					{
						
						 if(coins[10]>0)
						{
							coins[10]--;
							coins[15]++;
						}
						else if(coins[5]>=2)
						{
							coins[5]=coins[5]-2;
							coins[15]++;
						}
						else
						{
							ans="NO";
							break;
						}
					}
					else{
					    coins[5]++;
					}
				}
					
			}
			System.out.println(ans);
		}
	}
}
