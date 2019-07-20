#include<stdio.h>
int main()
{
int a,i=2,t;
  scanf("%d",&a);
  while(i)
  {
    t=a%10;
    a=a/10;
    i--;
  }
  printf("%d",t);
  return 0;
}