/* package codechef; // don't place package name! */

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
	public static HashMap<Character,Integer> creatMapFreq(char s[])
	{
		HashMap<Character,Integer> map=new HashMap<>();
    	for(int i=0;i<s.length;++i)
    	{
    		Integer k=map.get(s[i]);
    		map.put(s[i], (k==null)?1:k+1);
    	}
    	return map;
	}
	public static void main(String[] args) {
		FastReader obj=new FastReader();
		
        int t=obj.nextInt();
        
        while(t-->0) {
        	int n=obj.nextInt();
        	int m=obj.nextInt();
        	
        	int len1=(int)Math.ceil((double)n/9);
//        	System.out.println(len1);
        	int len2=(int)Math.ceil((double)m/9);
//        	System.out.println(len2);
        	
        	if(len1<len2)
        	{
        		System.out.println("0 "+(len1==0 ?1:len1));
        	}
        	else if(len2<len1)
        	{
        		System.out.println("1 "+(len2==0 ?1:len2));
        	}
        	else
        	{
        		System.out.println("1 "+(len2==0 ?1:len2));
        	}
        }
	}
}
//Code -aditya7409