#include<stdio.h>
int main()
{
  	int n,gr;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
}
  gr=a[0];
  for(int i=1;i<n;i++)
  {
    if(a[i]>gr)
    {
      gr=a[i];
    }
 }
  printf("%d",gr);
  return 0;
}