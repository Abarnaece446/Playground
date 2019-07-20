#include <stdio.h>
int main() {
	int n,p=1,sum=0,r;
  scanf("%d",&n);
  int a=n;
  int b=n;
  while(a>0)
  {
    r=a%10;
    for(int i=1;i<=r;i++)
    {
      p=p*i;
    }
    sum=sum+p;
    a=a/10;
    p=1;
  }
  if(n==sum)
  {
    printf("Yes");
  }
  else
    printf("No");

	return 0;
}