try:
    for i in range(int(input)):
        n=int(input())
        k=int(input())
        x=int(input())
        y=int(input())
    
    arr = [0] * n
    while(arr[x]!=1):
        arr[x]=1
        x=(x+k)%n
    if(arr[y]==1):
        print("YES")
    elif(arr[y]==0):
        print("NO")
except:
    pass