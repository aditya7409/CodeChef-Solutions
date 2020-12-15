import java.util.Scanner;

/* package codechef; // don't place package name! */




/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int i=1;
// 	static void Binary_Search1(int low ,int high)
// 	{
// 		Scanner input=new Scanner(System.in);
	
// 		if(low<high)
// 		{
// 			int mid=(low+high)/2;
// 			System.out.println(mid);
// 			System.out.flush();
			
// 			String x=input.next();
// 			if(x.charAt(0)=='E')
// 			{
// 			    System.exit(0);
// 			}
		
// 		    else if(x.charAt(0)=='G')
// 		    {
		       
// 		        Binary_Search1(mid+1,high);
// 		    }
// 		    else if(x.charAt(0)=='L')
// 		    {
// 		        Binary_Search1(low,mid-1);
// 		    }
			
// 		}
		
// 	}
	static void LieFinder(String rep,int n)
	{
		Scanner sc=new Scanner(System.in);
		while(rep.charAt(0)=='L')
		{
		   
			    System.out.println(n);
			    System.out.flush();
			    rep=sc.next();
			    if(rep.charAt(0)=='E')
			    {
			        System.exit(0);
			    }
		}
	}
	static void LieFinder1(String rep,int n)
	{
		Scanner sc=new Scanner(System.in);
		while(rep.charAt(0)=='G')
		{
		   
			    System.out.println(n);
			    System.out.flush();
			    rep=sc.next();
			    if(rep.charAt(0)=='E')
			    {
			        System.exit(0);
			    }
		}
	}
	static void Binary_Search(int low,int high,String rep,int n)
	{
		Scanner dc=new Scanner(System.in);
		while(low<=high)
		{
			
			int mid=(low+high)/2;
			System.out.println(mid);
			rep=dc.next();
			if(rep.charAt(0)=='E')
			{
			    System.exit(0);
			}
		
		    else if(rep.charAt(0)=='G')
		    {
		        
		        
		        if(i%2==1)
		        {
		            rep="L";
		            LieFinder(rep,n);
		        }
		        else{
		      
		            LieFinder1(rep,1);
		        }
		        low=mid+1;
		        i++;
		    }
		    else if(rep.charAt(0)=='L')
		    {
		        if(i%2==1)
		        {
		            LieFinder(rep,mid);
		        }
		        else{
		            rep="G";
		            LieFinder1(rep,1);
		        }
		        high=mid-1;
		        i++;
		    }
		}
		
	}
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		//Binary_Search1(1,n);
		int answer=n/2;
		System.out.println(answer);
		System.out.flush();
		String rep="";
		rep=obj.next();
		if(rep.charAt(0)=='E')
		{
		    System.exit(0);
		}
		else if(rep.charAt(0)=='L')
		{
		    LieFinder(rep,n);
		    Binary_Search(1,n,rep,n);
		    
		}
		else
		{
		    rep="L";
		    LieFinder(rep,n);
		    Binary_Search(1,n,rep,n);
		}
	}
	catch(Exception e){
	    return;
	    }
	}
}
