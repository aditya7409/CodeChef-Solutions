#include <stdio.h>
#include<stdlib.h>
#include<math.h>
int main(void) {
    int t;
    scanf("%d",&t);
    
    while(t-->0)
    {
        long long int n;
        scanf("%lld",&n);
        
        long long int sum=0;
        
        sum=((n)*(n+1))/2;
        
        long long int val=(sum)/2;
        
        if(sum%2==1)
        {
            printf("0");
            printf("\n");
        }
        else
        {
            long long int check=sqrt(sum);
            
            long long int sqrtSum=((check)*(check+1))/2;
            
                if(sqrtSum>val)
				{
					printf("%lld",n-check+1);
					printf("\n");
				}
				else if(sqrtSum<val)
				{
					printf("%lld",n-check);
					printf("\n");
				}
				else
				{
					printf("%lld",((check)*(check-1))/2+(((n-check)*(n-check-1))/2) +(n-check));
					printf("\n");
				}
        }
    }
    
	return 0;
}
//     long long int calculateEqual(long long int n,long long int check)
// 	{
// 		long long int val=((check)*(check-1))/2;
// 		val+=((n-check)* (n-check-1))/2;
// 		val+=n-check;
		
// 		return val;
// 	}
