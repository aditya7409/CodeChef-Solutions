
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		
		int t=obj.nextInt();
		
		while(t-->0)
		{
		    int n=obj.nextInt();
		    
		    int p=obj.nextInt();
		    
		    int [][] a=new int[n][n];
		    System.out.println("1"+" "+(1)+" "+(1)+" "+(n)+" "+n);
		    System.out.flush();
		    int c=obj.nextInt();
		    int cs=0;
		    for(int i=0;i<n;i++)
		    {
		        System.out.println("1"+" "+(i+1)+" "+(1)+" "+(i+1)+" "+n);
		        System.out.flush();
		        
		        int x=obj.nextInt();
		        int count=x;
		        if(x==-1)
		        {
		            System.exit(0);
		        }
		        else if(x==0)
		        {
		            continue;
		        }
		        else if(x==n)
		        {
		        	for(int k=0;k<n;k++)
		        	{
		        		a[i][k]=1;
		        		count--;
		        		
		        	}
		        	if(count==0)
	        		{
	        		    break;
	        		}
		        }
		        else
		        {
		            for(int j=0;j<n;j=j+2)
		            {
		                System.out.println("1"+" "+(i+1)+" "+(j+1)+" "+(i+1)+" "+(j+2));
		                System.out.flush();
		                
		                x=obj.nextInt();
		                if(x==-1)
		                {
		                    System.exit(0);
		                }
		                else if(x==2)
		                {
		                	a[i][j]=1;
		                	a[i][j+1]=1;
		                	count-=2;
		                	cs+=2;
		                	if(count==0)
		                	{
		                		break;
		                	}
		                }
		                else if(x==0)
		                {
		                    continue;
		                }
		                else if(x==1)
		                {
		                	System.out.println("1 "+(i+1)+" "+(j+1)+" "+(i+1)+" "+(j+1));
		                	System.out.flush();
		                	 x=obj.nextInt();
		                	 	if(x==-1)
								{
									System.exit(0);
								}
								else if(x==1)
								{
									a[i][j]=1;
									a[i][j+1]=0;
									count--;
									cs++;
									if(count==0)
									{
										break;
									}
								}
								else
								{
									a[i][j]=0;
									a[i][j+1]=1;
									count--;
									cs++;
									if(count==0)
									{
										break;
									}
								}
		                }
		            }
		        }
		        
		        if(c==cs)
		        {
		            break;
		        }
		    }
		    System.out.println("2");
		    System.out.flush();
		    for(int i=0;i<n;i++)
		    {
		    	for(int j=0;j<n;j++)
		    	{
		    		System.out.print(a[i][j]+" ");
		    	}
		    	System.out.print("\n");
		    }
		    System.out.flush();
		     int x=obj.nextInt();
		     if(x==-1)
		     {
		    	 System.exit(0);
		     }
		}  
		    
	}
}
