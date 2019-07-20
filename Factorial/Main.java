#include<stdio.h>
int main()
{
	
  long int n,res=1;
  scanf("%ld",&n);
  while(n)
  {
    res=res*n;
    n--;
}
  printf("%ld",res);
}
