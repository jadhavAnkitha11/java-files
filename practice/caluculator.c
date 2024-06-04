#include<stdio.h>
int main()
{
   char op;
   double a,b;
   printf("enter any operator (+,-,*,/) :");
   scanf(" %c",&op);
   printf("enter a and b operands:\n",a,b);
   scanf("%lf %lf",&a,&b);
   switch(op)
   {
       case '+':
       printf("%.1f + %.1lf =%.1lf",a,b,a+b);
       break;
        case '-':
       printf("%.1f - %.1lf =%.1lf",a,b,a-b);
       break;
        case '*':
       printf("%.1f * %.1lf =%.1lf",a,b,a*b);
       break;
        case '/':
       printf("%.1f / %.1lf =%.1lf",a,b,a/b);
       break;
       
       default:
       printf("you entered a wrong operator");
       
   }
   return 0;
}