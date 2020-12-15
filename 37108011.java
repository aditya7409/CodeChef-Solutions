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
			
			int k=obj.nextInt();
			
			String s=obj.next();
			
			int count0=0,count1=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='0')
				{
					count0++;
				}
				else
				{
					count1++;
				}
			}
			if(n%k!=0)
			{
				System.out.println("IMPOSSIBLE");
			}
			else
			{
				int val=n/k;
				
				if(count0%val!=0 || count1%val!=0 )
				{
					System.out.println("IMPOSSIBLE");
				}
				else
				{
					int a=count0/val;
					int b=count1/val;
					String str1="";
					while(a>0)
					{
						str1+='0';
						a--;
					}
					while(b>0)
					{
						str1+='1';
						b--;
					}
					String str2="";
					for(int i=str1.length()-1;i>=0;i--)
					{
						str2+=str1.charAt(i);
					}
					String l="";
					for(int i=0;i<val;i++)
					{
						if(i%2==0)
						{
							l+=str1;
						}
						else
						{
							l+=str2;
						}
					}
					System.out.println(l);
				}
			}
		}
	}
}
