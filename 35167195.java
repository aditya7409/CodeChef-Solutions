/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

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
	
	static long findSum(long n) 
    { 
        if (n % 2 == 0) 
            return (n / 2) * (n + 1); 
  
        // If n is odd, (n+1) must be even 
        else
            return ((n + 1) / 2) * n; 
    }
	public static void main(String[] args) {
		try {
			
				FastReader obj=new FastReader();
				
				int t=obj.nextInt();
				while(t-->0) {
					int n=obj.nextInt();
					int []a=new int[n];
					int []b=new int[n];
					long mincost=0;
					
					boolean res=true;
					for(int i=0;i<n;i++) {
						a[i]=obj.nextInt();
						
					}
					for(int i=0;i<n;i++) {
						b[i]=obj.nextInt();
					}
					
					HashMap<Integer,Integer> map=new HashMap<>();
					for(int i=0;i<n;i++) {
						Integer j=map.get(a[i]);
						map.put(a[i], (j==null)?1:j+1);
						Integer k=map.get(b[i]);
						map.put(b[i], (k==null)?1:k+1);
					}
					for(Map.Entry<Integer, Integer> i:map.entrySet()) {
						if(i.getValue()%2==1) {
							res=false;
							break;
						}
					}
					if(!res) {
						System.out.println("-1");
					}
					else {
						HashMap<Integer,Integer> map1=new HashMap<>();
						HashMap<Integer,Integer> map2=new HashMap<>();
						for(int i=0;i<n;i++) {
							Integer j=map1.get(a[i]);
							map1.put(a[i], (j==null)?1:j+1);
						}
						for(int i=0;i<n;i++) {
							Integer j=map2.get(b[i]);
							map2.put(b[i], (j==null)?1:j+1);
						}
						
						if(map1.equals(map2)) {
							System.out.println("0");
						}
						else {
							int min;
							Arrays.sort(a);
							Arrays.sort(b);
							if(a[0]<b[0]) {
								min=a[0];
							}
							else if(a[0]>b[0]) {
								min=b[0];
							}
							else {
								min=a[0];
							}
//							int max=b[n-1];
//							boolean result=true;
//							for(int i=0;i<n;i++) {
//								for(int j=0;j<n;j++) {
//									if(a[i]<=max) {
//									if(a[i]==b[j]) {
//										b[j]=-1;
//										a[i]=-1;
//										
//										break;
//									}
//									}else {
//										result=false;
//									}
//								}
//								if(!result) {
//									break;
//								}
//							}
							
							HashMap<Integer,Integer> map1a=new HashMap<>();
							HashMap<Integer,Integer> map2a=new HashMap<>();
							for(int i=0;i<n;i++) {
								Integer j=map1a.get(a[i]);
								map1a.put(a[i],(j==null)?1:j+1);
							}
							for(int i=0;i<n;i++) {
								Integer j=map2a.get(b[i]);
								map2a.put(b[i],(j==null)?1:j+1);
							}
							
							for(int i=0;i<n;i++) {
								Integer j=map2a.get(a[i]);
								map2a.put(a[i],(j==null)?0:j+1-1);
							}
							for(int i=0;i<n;i++) {
								Integer j=map1a.get(b[i]);
								map1a.put(b[i],(j==null)?0:j+1-1);
							}
							HashSet<Integer> hs=new HashSet<>();
							for(int i=0;i<n;i++) {
								hs.add(a[i]);
							}
							for(int i=0;i<n;i++) {
								hs.add(b[i]);
							}
							
							for(Integer c:hs) {
								if(map1a.get(c)<map2a.get(c)){
									map2a.replace(c, map2a.get(c)-map1a.get(c));
									map1a.replace(c, 0);

								}else if(map1a.get(c)>map2a.get(c)) {
									
									map1a.replace(c, map1a.get(c)-map2a.get(c));
									map2a.replace(c, 0);
								}else {
									map1a.replace(c, 0);
									map2a.replace(c, 0);
								}
							}
							ArrayList<Integer> list11=new ArrayList<>();
							ArrayList<Integer> list22=new ArrayList<>();
							
							for(Map.Entry<Integer, Integer> sd:map1a.entrySet()) {
								if(sd.getValue()!=0) {
									int rep=sd.getValue();
									while(rep>0) {
									list11.add(sd.getKey());
									rep--;
									}
								}
							}
							for(Map.Entry<Integer, Integer> sde:map2a.entrySet()) {
								if(sde.getValue()!=0) {
									int rep=sde.getValue();
									while(rep>0) {
									list22.add(sde.getKey());
										rep--;
									}
								}
							}
							Integer []c=new Integer[list11.size()];
							c=list11.toArray(c);
							Integer []d=new Integer[list22.size()];
							d=list22.toArray(d);
							
							HashMap<Integer,Integer> map11=new HashMap<>();
							HashMap<Integer,Integer> map21=new HashMap<>();
							for(int i=0;i<c.length;i++) {
								Integer j=map11.get(c[i]);
								map11.put(c[i], (j==null)?1:j+1);
							}
							for(int i=0;i<d.length;i++) {
								Integer j=map21.get(d[i]);
								map21.put(d[i], (j==null)?1:j+1);
							}
							
							HashSet<Integer> set1=new HashSet<>();
							HashSet<Integer> set2=new HashSet<>();
							for(int i=0;i<c.length;i++) {
								
									if(!set1.contains(c[i])) {
										set1.add(c[i]);
									}
								
							}
							for(int i=0;i<d.length;i++) {
								
									if(!set1.contains(d[i])) {
										set2.add(d[i]);
									}
								
							}
							
							ArrayList<Integer> list1=new ArrayList<>();
							ArrayList<Integer> list2=new ArrayList<>();
							for(Integer i:set1) {
								int frequency=map11.get(i);
								frequency=frequency/2;
								for(int j=0;j<frequency;j++) {
									list1.add(i);
								}
							}
							for(Integer i:set2) {
								int frequency=map21.get(i);
								frequency=frequency/2;
								for(int j=0;j<frequency;j++) {
									list2.add(i);
								}
							}
							Collections.sort(list1);
							Collections.sort(list2);
							Collections.reverse(list2);
							
							
							int localmin=0;
							for(int k=0;k<list1.size();k++) {
							if(list1.get(k)<list2.get(k)) {
								localmin=list1.get(k);
								
							}
							else {
								localmin=list2.get(k);
							}
							Integer freq1=map11.get(localmin);
							Integer freq2=map21.get(localmin);
							
							if(freq1==null) {
								freq2=freq2/2;
								int dt=freq2*2;
								if(freq2>1) {
									freq2=1;
									map21.replace(localmin, dt-2);
								}
								localmin=localmin*freq2;
							}
							else {
								freq1=freq1/2;
								int ct=freq1*2;
								if(freq1>1) {
									freq1=1;
									map11.replace(localmin,ct-2);
								}
								localmin=localmin*freq1;
							}
							if(localmin<(2*min)) {
								mincost+=localmin;
							}else {
								mincost+=2*min;
							}
							
						}
							System.out.println(mincost);
 						}
					}
				}
			}
		catch(Exception e)
		{
			return;
		}

	}
}
