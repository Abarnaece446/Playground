#include<stdio.h>

int main()
{
  char str[1000];
  int c=1,i=0;
  gets(str);
  while(str[i]!='\0')
  {
    if(str[i]==' ')
    {
      c++;
    }
    i++;
  }
printf("%d",c);
 return 0;
}