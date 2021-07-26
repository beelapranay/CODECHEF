t = int(input())
while t > 0:
    n, k = map(int, input().split())
    size = 2**n
    print(2*min(k, size//2)*(size-1))
    t -= 1