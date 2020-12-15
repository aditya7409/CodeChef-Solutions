for _ in range(int(input())):
    stri=input()
    n=len(stri)
    lim=n//2-1
    at=stri[0]
    bt=stri[1]
    i=0
    j=2
    ft=0
    z=0
    while 1:
        if at==bt:
            k=len(stri[j:] )
            if stri[j:j+k//2]==stri[j+k//2:]:
                ft+=1
        i+=1
        j=2*i+2
        at=stri[:i+1]
        bt=stri[i+1:i+i+2]
        
        if i==lim:
            break
    print(ft)
