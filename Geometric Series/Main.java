#include<stdio.h>
int main()
{
 int n1=1,n2=1,nterm=0;
  int n;
  scanf("%d",&n);
  if(n%2!=0)
  {
    n=(n/2)+1;
    nterm=pow(2,(n-1));
    printf("%d",nterm);
  }
  else
  {
    n=n/2;
    nterm=pow(3,(n-1));
    printf("%d",nterm);
    }
    
   return 0;
}