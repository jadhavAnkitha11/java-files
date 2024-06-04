import java.util.*;
class SingleInheritance
{
void rightangle()
{
for(int i=1;i<=4;i++)
{
for(int j=3;j>=i;j--)
{
System.out.print("  ");
}

for(int k=1;k<=i;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}
class SquarePattern extends SingleInheritance
{
void square()
{
for(int i=1;i<=4;i++)
{
for(int j=1;j<=4;j++)
{
System.out.print(j);
}
System.out.print("\n");
}
}
}
class Pattern18
{
public static void main(String args[])
{
SquarePattern s1=new SquarePattern();
s1.rightangle();
s1.square();
}
}
