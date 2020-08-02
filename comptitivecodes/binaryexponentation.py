import sys
def last_digit(a,b):
    if b==0:
        return a
    res=last_digit(a,b/2)
    if b%2==0:
        return res*res
    else:
        return res*res*a



if __name__=='__main__':
    sys.setrecursionlimit(1500)
    n=int(input())
    for i in range(n):
        input_values=str(input())
        result=last_digit(int(input_values.split(" ")[0]),int(input_values.split(" ")[1]))
        print(str(result)[-1])