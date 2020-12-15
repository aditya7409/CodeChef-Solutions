for _ in range(int(input())):
    n=int(input())
    a=list(map(int,input().split()))
    t=[0 for i in range(1001)]
    cur=a[0]
    t[a[0]]=1
    ft=1
    for i in range(1,n):
        if t[a[i]]>0 and a[i]!=cur:
            ft=0
            break
        t[a[i]]+=1
        cur =a[i]
    new=[]
    for i in t:
        if i>0:
            new.append(i)
    kt=len(new)
    new=set(new)
    new=list(new)
    if kt!=len(new):
        ft=0
    if ft==0:
        print("NO")
    else:
        print("YES")