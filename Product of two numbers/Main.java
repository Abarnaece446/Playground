#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d",&a);
  scanf("%d",&b);
  if(a==0||b==0)
  {
    printf("0");
   
  }
  else
  {
    c=a*b;
    printf("%d",c);
  }
    
  return 0;
}