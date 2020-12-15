import math
for _ in range(int(input())):
    ts=int(input())
    result=0
    if ts%2==1:
        result=ts//2
        
    else:
        kt=True
        x=1
        while kt:
            if ts%(2**(x+1))==0:
                x+=1
            else:
                kt=False
        result=ts//(2**(x+1))
    print(result)
