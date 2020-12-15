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
			
			int []a=new int [n];
			
			for(int i=0;i<n;i++)
			{
				a[i]=obj.nextInt();
			}
			
			HashMap<Integer,Integer> map=new HashMap<>();
			for(int i=0;i<n;i++)
			{
				Integer k=map.get(a[i]);
				map.put(a[i], (k==null)?1:k+1);
			}
//			System.out.println(map);
			ArrayList<Integer> list=new ArrayList<>();
			int max=-1;
			HashMap<Integer,Integer> map2=new HashMap<>();
			
			for(Map.Entry<Integer, Integer> j:map.entrySet())
			{
				Integer f=map2.get(j.getValue());
				map2.put(j.getValue(), (f==null)?1:f+1);
				
			}
//			System.out.println(map2);
			for(Map.Entry<Integer, Integer> j:map2.entrySet())
			{
				if(j.getValue()>max)
				{
					max=j.getValue();
				}
			}
			for(Map.Entry<Integer, Integer> j:map2.entrySet())
			{
				if(j.getValue()==max)
				{
					list.add(j.getKey());
				}
			}
			Collections.sort(list);
			System.out.println(list.get(0));
		}
	}
	
}
