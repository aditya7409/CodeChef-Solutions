#include <stdio.h>


int main() {
    int t;
	scanf("%d",&t);
	
	while(t-->0)
	{
	    int n;
	    scanf("%d",&n);
	    
	    int a[n][n];
	    int c=1;
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            a[i][j]=c;
	            c++;
	        }
	    }
	    
	    if(n%2==1)
	    {
	        for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						printf("%d ",a[i][j]);
					}
					printf("\n");
				}
	    }
	    	else
			{
				int lr=1;
				for(int i=0;i<n;i++)
				{
					if(lr==1)
					{
						for(int j=0;j<n;j++)
						{
							printf("%d ",a[i][j]);
						}
					}
					else
					{
						for(int j=n-1;j>=0;j--)
						{
							printf("%d ",a[i][j]);
						}
					}
					printf("\n");
					if(lr==1)
					{
					    lr=0;
					}
					else
					{
					    lr=1;
					}
				}
			}
	}
	return 0;
}
