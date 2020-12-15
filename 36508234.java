import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    //	Template For Fast i/o copied From  Gfg
	static HashMap<Integer,Integer> newmap=new HashMap<>();
	static HashMap<Integer,Integer> map=new HashMap<>();
	static LinkedList<String> newList=new LinkedList<>();
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
	public static long find(long x,long y)
	{
		long temp; 
	    if( y == 0) 
	        return 1%1000000007; 
	    temp = find(x, y/2); 
	    if (y%2 == 0) 
	        return (temp*temp)%1000000007; 
	    else
	        return (x*temp*temp)%1000000007;   
	}
	public static void main(String[] args) {
		try {
		FastReader obj=new FastReader();
        int t=obj.nextInt();
        while(t-->0) {
        	int n=obj.nextInt();
        	LinkedList<Long> f=new LinkedList<>();
        	HashSet<Long> set=new HashSet<>();
        	for(int i=0;i<n;i++)
        	{
        		long val=obj.nextLong();
        		f.add(val);
        		set.add(val);
        	}
        	if(set.size()==f.size())
        	{
        		ArrayList<Long> list=new ArrayList<>();
        		for(long i=0;i<n;i++)
        		{
        			long v=find(2,n-i-1);
        			list.add(v);
        		}
        		for(long j: list)
        		{
        			System.out.print(j+" ");
        		}
        		System.out.println();
        	}
        	else
        	{
        		count(f);
    			for(String z:newList)
    			{
    				for(int j=0;j<z.length();j++)
    				{
    					Integer k=map.get(Character.getNumericValue(z.charAt(j)));
        				map.put(Character.getNumericValue(z.charAt(j)), (k==null)?1:k+1);
    				}
    				int max=-1;
        			for(Map.Entry<Integer, Integer> k:map.entrySet())
        			{
       					if(k.getValue()>max)
       					{
       						max=k.getValue();
       					}
       				}	
        			int maxVal=Integer.MAX_VALUE;
        			for(Map.Entry<Integer, Integer> k:map.entrySet())
        			{
        				if(k.getValue()==max)
       					{
       						if(k.getKey()<maxVal)
       						{
       							maxVal=k.getKey();    				
       						}
       					}
        			}
        			if(maxVal!=Long.MAX_VALUE)
        			{
        				Integer m=newmap.get(maxVal%1000000007);
        				newmap.put(maxVal, (m==null)?1:m+1);
        			}
        			map.clear();
    			}
        		for(int l=0;l<n;l++)
        		{
        			Integer check=newmap.get(l+1);
        			if(check==null)
       				{
       					System.out.print("0 ");
       				}
       				else
       				{
       					System.out.print(check+" ");
       				}
       			}
        		System.out.println();
        		
        	}
        	newList.clear();
        	newmap.clear();
        }
	}
		catch(Exception e)
		{
			return;
		}
	}
	private static void count(LinkedList<Long> f) {
		StringBuilder sb=new StringBuilder();
		for(Long h:f)
		{
			sb.append(h);	
		}
		String s=sb.toString();
		count(s,"");
	}
	private static void count(String s, String str) {
		
		if(s.length()==0)
		{
			if(str.length()!=0)
			{
				newList.add(str);
				return;
			}
			return;
		}
		StringBuilder sb=new StringBuilder();
		sb.append(s.charAt(0));
		count(s.substring(1),str.concat(sb.toString()));
		count(s.substring(1),str);	
    }

}
// Code -aditya7409