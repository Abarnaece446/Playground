#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int t=n,sum=0,r;
  while(t>0)
  {
    r=t%10;
    sum=sum+r;
    t=t/10;
  }
  printf("%d",sum);
	return 0;
}