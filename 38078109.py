for _ in range(int(input())):
    n,k = map(int,input().split())

    
    s = input()
   
    if k==0:
        print(s.count('0'))
        continue
        
    if s.count('0') == n:
        print(0)
        continue
    if k==0:
        print(s.count('0'))
        continue
    front = 0
    back = 0
    
    while s[front]=='0':
        front+=1
    i = n-1
    
    while s[i] == '0':
        i-=1
        back+=1
    #print(front)
    #print(back)
    cons = []
    zero = 0
    flag = 0
    for i in range(front,n-back):
        if s[i] == '0':
            flag=1
            zero+=1
        if s[i] == '1':
            if flag:
                cons.append(zero)
                zero = 0
                flag =0

    cons.sort()
    cons.reverse()

    if cons==[]:
        if k==1:
            print(min(front,back))
            continue
        if k==0:
            print(front+back)
            continue
        elif k>1:
            print(0)
            continue
    
    if k%2:
        if front>back:            
            front = 0
        else:
            back = 0
        k-=1
    if front+back>cons[0]:
        front =0
        back = 0
        k-=2
    
    
    i = 0
    while cons[i]>=front+back and k>0:
        cons[i] = 0
        k-=2
        i+=1
        if i>len(cons)-1:
            break
    
    if k:
        front=0
        back = 0
        k-=2
    
    while k>0 and i<len(cons):
        cons[i] = 0
        k-=2
        i+=1
        
    print(sum(cons)+front+back)