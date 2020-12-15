import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.*;

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
	static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    }
	
	public static void main(String [] args)
	{
		FastReader obj=new FastReader();
		
		int t=obj.nextInt();
		
		while(t-->0)
		{
			int n=obj.nextInt();
			
			int mat[][]=new int[n][n];
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					mat[i][j]=obj.nextInt();
				}
			}
			boolean flag=true;
			
			int k=1;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(mat[i][j]!=k)
					{
						flag=false;
						break;
					}
					k++;
				}
				if(!flag)
				{
					break;
				}
			}
			if(flag)
			{
				System.out.println("0");
			}
			else
			{
				int []a=new int[n];
				for(int i=0;i<n;i++)
				{
					a[i]=mat[0][i];
				}
				
				int count=0;
				 flag=true;
				for(int i=n-1;i>=0;i--)
				{
					if(flag)
					{
						if(a[i]!=i+1)
						{
							flag=false;
							count++;
						}
						
					}
					else
					{
						if(mat[i][0]!=i+1)
						{
							flag=true;
							count++;
						}
					}
				
				}
				
				System.out.println(count);
			}
		}	
	}
}
