/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{//	Template For Fast i/o copied From Gfg
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
	static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    }
	static boolean dp[][]=new boolean[10002][10002];
	
	public static void main(String[] args) {
		
		FastReader obj=new FastReader();
		
		int t=obj.nextInt();
		
		while(t-->0)
		{
			int n=obj.nextInt();
			
			int k=obj.nextInt();
			
			int l=obj.nextInt();
			
			if(k*l<n)
			{
				System.out.println("-1");
			}
			else
			{
				int []a=new int[k];
				
				for(int i=0;i<k;i++)
				{
					a[i]=l;
				}
				ArrayList<Integer>list=new ArrayList<>();
				int prev=Integer.MAX_VALUE;
				int start =0;
				boolean flag=true;
				for (int i = 0; i<n; i++) {
						if(a[(start+i)%k]!=0)
						{
							if(prev!=(i%k)+1)
							{
								list.add((i%k)+1);
								a[(start+i)%k]--;
								prev=i%k+1;
							}
							else
							{
								flag=false;
								System.out.print("-1");
								break;
							}
						}
				}
				if(flag)
				{
					for(int i=0;i<n;i++)
					{
						System.out.print(list.get(i)+" ");
					}
				}
				System.out.println();
			}
			
		}
	}

}
