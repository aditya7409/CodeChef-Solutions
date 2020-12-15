/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
//	Template for fast input output copied from Geeksforgeeks
	
	private static long doesnotFound(long[] x, int i, int j, int k, long m, long l) {
		
		if(m==j && l==k)
		{
			return x[i];
		}
		if(m>l)
		{
			return 0;
		}
		
		int middle=(j+k)/2;
		return find1(doesnotFound(x,i*2,j,middle,m,find2(l, middle)), doesnotFound(x,i*2+1,middle+1,k,find1(m, middle+1),l));
		
	}
	private static void precompute1(int n,long h[],long lt[]) {
		HashSet<Integer> set1=new HashSet<>();
		
		Deque<Integer> dq1=new ArrayDeque<>();
		dq1.push( 0);
		lt[0]=-1;
		for(int i=1;i<n;++i)
		{
			while(!dq1.isEmpty() && h[dq1.peek()]<=h[i])
			{
				dq1.pop();
			}
			if(dq1.isEmpty())
			{
				lt[i]=-1;
			}
			else
			{
				lt[i]=dq1.peek();
			}
			dq1.push(i);
		}
		set1.addAll(dq1);
	}
	private static long find1(long l ,long m)
	{
		if(l>m) {
		return l;
		}
		else if(m>l)
		{
			return m;
		}
		return l;
	}
	private static void precompute2(int n,long h[],long rt[])
	{
		HashSet<Integer> set2=new HashSet<>();
		
		Deque<Integer> dq2=new ArrayDeque<>();
		dq2.push((n-1));
		rt[n-1]=-1;
		for(int i=n-2;i>=0;--i)
		{
			while(!dq2.isEmpty() && h[dq2.peek()]<=h[i])
			{
				dq2.pop();
			}
			if(dq2.isEmpty())
			{
				rt[i]=-1;
			}
			else
			{
				rt[i]=dq2.peek();
			}
			dq2.push(i);
		}
		set2.addAll(dq2);
	}
	private static long find2(long num1,long num2) {
		if(num1<num2) {
			return num1;
		}
		else if(num2<num1) {
			return num2;
		}
		return num2;
	}
public static void main(String[] args) {
		
		FastReader obj=new FastReader();
		int n=obj.nextInt();
		int q=obj.nextInt();
		long []h=new long[n];
		long []a=new long[n];
		for(int i=0;i<n;i++)
		{
			h[i]=obj.nextLong();
		}
		for(int i=0;i<n;i++)
		{
			a[i]=obj.nextLong();
		}
		long x[]=new long[(4*n)+4];
		construct(x,h,1,0,n-1);
		long []lt=new long[n];
		precompute1(n,h,lt);
		long []rt=new long[n];
		precompute2(n,h,rt);
		long right[]=new long[n];
		for(int i=n-1;i>=0;--i)
		{
	
			if(rt[i]==-1)
			{
				right[i]=a[i];
			}
			else
			{
				right[i]=a[i]+right[(int) rt[i]];
			}
			
		}
		long left[]=new long[n];
		for(int i=0;i<n;++i)
		{
			
			if(lt[i]==-1)
			{
				left[i]=a[i];
			}
			else {
				left[i]=a[i]+left[(int) lt[i]];
			}
			
		}
		
		while(q-->0)
		{
			long kt=obj.nextLong();
			int b=obj.nextInt();
			int c=obj.nextInt();
			
			b--;
			c--;
			long answer=0;
			if(kt==1)
			{
				a[b]=c+1;
				for(int i=b;i>=0;--i)
				{
					if(rt[i]==-1)
					{
						right[i]=a[i];
					}
					else
					{
						right[i]=a[i]+right[(int) rt[i]];
					}
				}
				for(int i=b;i<n;++i)
				{
					if(lt[i]==-1)
					{
						left[i]=a[i];
					}
					else
					{
						left[i]=a[i]+left[(int) lt[i]];
					}
				}
			}
			else {
			if(h[b]<=h[c] && b!=c)
			{
				System.out.println("-1");
			}
			else if(b==c)
			{
				System.out.println(a[b]);
			}
			else if(b<c)
			{
				answer=left[c]-left[b]+a[b];
				if(doesnotFound(x,1,0,n-1,b+1,c)>=h[b])
				{
					answer=-1;
					
				}
				System.out.println(answer);
			}
			else
			{
				answer=right[c]-right[b]+a[b];
				if(doesnotFound(x,1,0,n-1,c,b-1)>=h[b])
				{
					answer=-1;
				}
				System.out.println(answer);
			}
			}
		}
	}
	
	private static void construct(long[] x, long[] h, int i, int j, int k) {
		if(j!=k)
		{
			
			int mid=(j+k)/2;
			construct(x,h,i*2,j,mid);
			construct(x,h,i*2+1,mid+1,k);
			x[i]=Math.max(x[i*2],x[i*2+1]);
		}
		else
		{
			x[i]=h[j];
		}
	}
}
