#include<stdio.h>
int main()
{
 long int n,s,i=0,a[10];
   scanf("%ld",&n);
  while(n>0)
  {
    a[i]=n%8;
    n=n/8;
    i++;
  }
  for(int j=i-1;j>=0;j--)
  {
    printf("%d",a[j]);
  }
 return 0;
}