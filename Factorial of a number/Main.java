#include <stdio.h>
int main() {
	int n,p=1;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    p=p*i;
  }
  printf("%d",p);
	return 0;
}