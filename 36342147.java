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
        	String s=obj.next();
        	String p=obj.next();
        	char q[]=s.toCharArray();
        	char w[]=p.toCharArray();
        	ArrayList<Character> P=new ArrayList<>();
        	for(int i=0;i<p.length();++i)
        	{
        		P.add(w[i]);
        	}
        	HashMap<Character,Integer> mapa=new HashMap<>();
        	HashMap<Character,Integer> mapb=new HashMap<>();
        	mapa=creatMapFreq(q);
        	mapb=creatMapFreq(w);
        	for(Map.Entry<Character, Integer> k:mapb.entrySet())
        	{
        		mapa.put(k.getKey(), mapa.get(k.getKey())-mapb.get(k.getKey()));
        	}
        	ArrayList<Character> list=new ArrayList<>();
        	
        	for(Map.Entry<Character, Integer> k:mapa.entrySet())
        	{
        		int val=k.getValue();
        		
        		while(val-->0)
        		{
        			list.add(k.getKey());
        		}
        	}
        	
        	Collections.sort(list);
        	ArrayList<Character> output1=new ArrayList<>();
        	ArrayList<Character> output2=new ArrayList<>();
        	ArrayList<Character> prefix1=new ArrayList<>();
        	ArrayList<Character> prefix2=new ArrayList<>();
        	ArrayList<Character> suffix1=new ArrayList<>();
        	ArrayList<Character> suffix2=new ArrayList<>();
        	
        	
        	for(int i=0;i<list.size();++i)
        	{
        		int comp=Character.compare(list.get(i), p.charAt(0));
        	
        		if(comp<0)
        		{
        			prefix1.add(list.get(i));
        		}
        		else
        		{
        			break;
        		}
        	}
        	for(int i=0;i<list.size();++i)
        	{
        		int comp=Character.compare(list.get(i), p.charAt(0));
        		
        		if(comp<=0)
        		{
        			prefix2.add(list.get(i));
        		}
        		else
        		{
        			break;
        		}
        	}
        	int length1=list.size()-prefix1.size();
        	int length2=list.size()-prefix2.size();
        	for(int i=list.size()-length1;i<list.size();++i)
        	{
        		suffix1.add(list.get(i));
        		
        	}
//        
        	for(int i=list.size()-length2;i<list.size();i++)
        	{
        		suffix2.add(list.get(i));
        	}
        	output1.addAll(prefix1);
        	output1.addAll(P);
        	output1.addAll(suffix1);
        	output2.addAll(prefix2);
        	output2.addAll(P);
        	output2.addAll(suffix2);
        	boolean flag1=false,flag2=false;
        	for(int i=0;i<output1.size();++i)
        	{
        		if(output1.get(i)!=output2.get(i))
        		{
        			int comp=Character.compare(output1.get(i), output2.get(i));
        			if(comp<=0)
        			{
        				flag1=true;
        			}
        			else
        			{
        				flag2=true;
        			}
        			break;
        		}
        	}
        	if(flag1 && !flag2)
        	{
        		for(char j:output1)
        		{
        			System.out.print(j);
        		}
        	}
        	else
        	{
        		for(char j:output2)
        		{
        			System.out.print(j);
        		}
        	}
        	System.out.println();
        }
	}
}
// code -aditya7409