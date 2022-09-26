a=int(input())
n=1
x=[n]
if a==1:
  x=[n]
elif a==0:
  x=[0]
else:
  z=0
  for in range(a-1):
    z=x[-1]+2
    x.append(z)
print(*x)
 
