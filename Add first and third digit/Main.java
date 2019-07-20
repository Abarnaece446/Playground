#include<stdio.h>
int main()
{
  int n1,a,t,i=2,r;
  
   scanf("%d",&a);
  t=a;
   n1=t%10;
  while(i)
  {
    t=t/10;
    i--;
  }
  r=n1+t;
  printf("%d",r);
    
  
  return 0;
}