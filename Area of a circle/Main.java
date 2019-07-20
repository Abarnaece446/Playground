#include<stdio.h>
# define PI 3.14
int main()
{
 int d;
  float r,res;
  scanf("%d",&d);
  r=(float)d/2;
  res=PI*r*r;
  printf("%0.2f",res);
  return 0;
}