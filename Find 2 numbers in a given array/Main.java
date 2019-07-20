#include<stdio.h>
int main()
{
  	int n;
  scanf("%d",&n);
  int a[n],s1,s2,f=0,f1=0;
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
}
  scanf("%d%d",&s1,&s2);
  for(int i=0;i<n;i++)
  {
    if(a[i]==s1)
    {
      printf("Element 1 index = %d\n",i);
      f=1;
      break;
    }
  }
    if(f==0)
      printf("Element 1 index = -1\n");
  for(int i=0;i<n;i++)
  {
    if(a[i]==s2)
    {
      printf("Element 2 index = %d\n",i);
      f1=1;
      break;
    }
  }
    if(f1==0)
      printf("Element 2 index = -1\n");
  return 0;
}
    