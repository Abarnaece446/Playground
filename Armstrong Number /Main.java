#include<stdio.h>
#include<math.h>
int main() {
	int n;
    scanf("%d",&n);
  int a,b,i=0,s=0,sum,r;
  a=n;
  b=n;
  while(a>0)
  {
    i++;
    a=a/10;
  }
  while(b>0)
  {
    r=b%10;
    sum=pow(r,i);
    s=s+sum;
    b=b/10;
  }
  if(n==s)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
  return 0;
}
 


    
	