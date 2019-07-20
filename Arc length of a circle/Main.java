#include<stdio.h>
# define PI 3.14
int main()
{
float r,teta,res;

scanf("%f",&r);
scanf("%f",&teta);
res=(2*PI*r)*(teta/360);
printf("%0.2f",res);
 return 0;
}