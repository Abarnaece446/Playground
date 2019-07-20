#include<stdio.h>
#include<math.h>
int main()
{
  long int a,sum=0;
  int i=0,rem,base=1;
  scanf("%ld",&a);
  int n=a;
  while(a>0)
  {
    rem=a%10;
    sum=sum+(rem*base);
    a=a/10;
    base=base*2;
  }
  printf("%ld",sum);
  return 0;
}