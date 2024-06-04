import java.util.*;
class Pattern9
{
public static void main(String args[])
{
for(int i=1;i<=4;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(   i);
}
System.out.print("\n");
}
for(int i=1;i<=3;i++)
{
for(int j=3;j>=i;j--)
{
System.out.print(j);
}
System.out.print("\n");
}
}
}