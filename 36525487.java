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
	public static HashMap<Integer,Integer> creatMapFreq(int s[])
	{
		HashMap<Integer,Integer> map=new HashMap<>();
    	for(int i=0;i<s.length;++i)
    	{
    		Integer k=map.get(s[i]);
    		map.put(s[i], (k==null)?1:k+1);
    	}
    	return map;
	}
	public static void main(String[] args) {
	    try{
		FastReader obj=new FastReader();
		
        int t=obj.nextInt();
        
        while(t-->0) {
        	int n=obj.nextInt();
        	int k=obj.nextInt();
        	int []f=new int[n];
        	for(int i=0;i<n;i++)
        	{
        		f[i]=obj.nextInt();
        	}
        	int count=1;
        	HashMap<Integer,Integer> map=new HashMap<>();
        	map=creatMapFreq(f);
        	HashSet<Integer> set=new HashSet<>();
        	for(int i=0;i<f.length;i++)
        	{
        		if(!set.contains(f[i]))
        		{
        			set.add(f[i]);
        		}
        		else
        		{
        			count++;
        			set.clear();
        			set.add(f[i]);
        		}
        	}
        	count=count*k;
//        	System.out.println(count);
        	int val=0;
        	for(Map.Entry<Integer, Integer> j:map.entrySet())
        	{
        		if(j.getValue()>1)
        		{
        			val+=j.getValue();
        		}
        	}
        	val=val+k;
//        	System.out.println(val);
        	count=Math.min(val,count);
        	map.clear();
        	int i=0;
        	int j=n-2;
        	while(i!=j)
        	{
        		
        		int value=find(i,j,f);
        		int value2=find(j+1,n-1,f);
        		value=(value==0)?k:value+k;
        		value2=(value2==0)?k:value2+k;
//        		System.out.println(i+" "+j+" "+value);
//        		System.out.println((j+1)+" "+(n-1)+" "+value2);
        		value=value2+value;
//        		System.out.println(count);
        		count=Math.min(value, count);
        		j--;
        	}	
        	
//        	count=Math.min(val, count);
        	System.out.println(count);
        }
	}
	catch(Exception e)
	{
	    return;
	}
}
	private static int find(int i, int j, int[] f) {
		HashMap<Integer,Integer> newmap=new HashMap<>();
		newmap=createMap(f,i,j);
//		System.out.println(newmap);
//		System.out.println();
		int  val=0;
		for(Map.Entry<Integer, Integer> k:newmap.entrySet())
    	{
    		if(k.getValue()>1)
    		{
    			val+=k.getValue();
    		}
    	}
		
		return val;
	}
	private static HashMap<Integer, Integer> createMap(int[] f, int i, int j) {
		HashMap<Integer,Integer> map=new HashMap<>();
		
    	for(int x=i;x<=j;++x)
    	{
    		Integer k=map.get(f[x]);
    		map.put(f[x], (k==null)?1:k+1);
    	}
//    	System.out.println(map);
    	return map;
	}
}
// Code -aditya7409