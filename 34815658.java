/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.StringTokenizer;
import java.util.Vector;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 
	
	static void check(ArrayList<Integer> a,int n)
	{
		HashSet<Integer> set=new HashSet<>();
		
		set.addAll(a);
		if(set.size()==n)
		{
			System.out.println("YES");
			Collections.sort(a);
			for(int i=0;i<a.size();i++)
			{
				System.out.print(a.get(i)+" ");
			}
		}
		else
		{
			ArrayList<Integer> v1 = new ArrayList<Integer>(),  
	                    v2 = new ArrayList<Integer>();  
	  
	      
			HashMap<Integer, Integer> mpp = new HashMap<>();  
	  
	      
			for (int i = 0; i < n; i++)  
			{  
	  
	         
				mpp.put(a.get(i),(mpp.get(a.get(i)) == null?0:mpp.get(a.get(i)))+1);  
	  
	         
				if (mpp.get(a.get(i)) == 1)  
					v1.add(a.get(i));  
	  
	         
				else if (mpp.get(a.get(i)) == 2)  
					v2.add(a.get(i));  
	  
	         
				else 
				{  
					System.out.println("NO");  
					return; 
				}  
			}
			int max=-1;
			for(int i=0;i<n;i++)
			{
				if(a.get(i)>max)
				{
					max=a.get(i);
				}
			}
			if(Collections.frequency(a, max)==2)
			{
				System.out.println("NO");
				return;
	    	
			}
			else
			{
	      
				Collections.sort(v1);  
	  
	     
				System.out.println("YES"); 
				for (int i = 0; i < v1.size(); i++)  
					System.out.print(v1.get(i) + " ");  
	  
	      
				Collections.sort(v2);  
				Collections.reverse(v2); 
	  
	      
	     
				for (int i = 0; i < v2.size(); i++)  
					System.out.print(v2.get(i) + " ");
			
			}
		}
	    System.out.println();
	}
	public static void main(String[] args) {
		try {
			
				Reader obj=new Reader();
				
				int t=obj.nextInt();
				
				while(t-->0)
				{
					int n=obj.nextInt();
					
					ArrayList<Integer> list=new ArrayList<Integer>();
					
					for(int i=0;i<n;i++)
					{
						list.add(obj.nextInt());
					}
					check(list,n);
				}
		}
		
		catch(Exception e)
		{
			return;
		}

	}
	
	
}
