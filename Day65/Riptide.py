t = int(input())
 
for i in range(t):
    a,b,c = map(int, input().split())
 
    res = 0
    
    while (True):
        if a == b or b == c or c == a:
            print(res)
            break
        
        if a > b and a > c:
            if b > c:
                a-=1
                c+=1
            else:
                a-=1
                b+=1
        
        elif b > a and b > c:
            if a > c:
                b -= 1
                c += 1
            else:
                b -= 1
                a += 1
        
        else:
            if a > b:
                c -= 1
                b += 1
            else:
                c -= 1
                a += 1
        
        res += 1