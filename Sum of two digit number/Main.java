#include<stdio.h>
int main()
{
  int a,i=2,t,sum=0;
  scanf("%d",&a);
  t=a;
  while(i)
  {
    sum=sum+(t%10);
    t=t/10;
    i--;
  }
  printf("%d",sum);
  return 0;
}