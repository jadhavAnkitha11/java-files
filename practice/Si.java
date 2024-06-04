import java.util.*;
class Pattern1
{
void rightAngleTriangle()
{
for(int i=1;i<=4;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(i);
}
System.out.println();
}
for(int i=4;i>=1;i--)
{
for(int j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}
}
}

class Pattern2 extends Pattern1
{
void prime()
{
int i,j,count=0;

for( i=111;i<=999;i++)
{
for( j=1;j<=i;j++)
{
if(i%j==0)
{
count=count+1;
}
}
if(count==2)
{
System.out.println(i);
}
}
}
}

class Si
{
public static void main(String args[])
{
Pattern2 p1=new Pattern2();
p1.rightAngleTriangle();
p1.prime();

}
}