a=int(input())
n=1
x=[n]
if a==1 or a==2:
  x=[n]
elif a==0:
  x=[0]
else:
  if a%2==0:
    a=a-1
  z=0
  for i in range(a-1):
    z=x[-1]+2
    x.append(z)
print(*x)
