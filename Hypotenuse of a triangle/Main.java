#include<stdio.h>
#include<math.h>
int main()
{
  float o,a,res;
  scanf("%f%f",&o,&a);
  res=sqrt((o*o)+(a*a));
  printf("%0.2f",res);
  return 0;
}