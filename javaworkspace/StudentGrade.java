import java.util.scanner;
class StudentGrade
{
 public void grade()
{
int E,T,H,M,S,total,avg;
System.out.println("Enter all subject marks:");
Scanner sc=new Scanner(System.in);
E=sc.nextInt();
T=sc.nextInt();
H=sc.nextInt();
M=sc.nextInt();
S=sc.nextInt();
total=E+T+H+M+S;
System.out.println("total marks of all subjects are: "+total);
avg=total/5;
System.out.println("avg marks of all subjects are: "+avg);
if(avg>90 && avg<=100)
{
System.out.println("O grade");
}else if(avg>80 && avg<=90)
{
System.out.println("A grade");
}else if(avg>70 && avg<=80)
{
System.out.println("B grade");
}else if(avg>60 && avg<=70)
{
System.out.println("C grade");
}else if(avg>50 && avg<=60)
{
System.out.println("D grade");
}else if(avg>40 && avg<=50)
{
System.out.println("pass");
}else{
System.out.println("Fail");
}
}
}
class Swapping extends StudentGrade
{
void swap()
{
int a,b,temp;
System.out.println("Enter a and b values");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
System.out.println("before swapping a and b values are:"+a+","+b);
temp=a;
a=b;
b=temp;
System.out.println("after swapping a and b values are: "+a+","+b);
}
}

class Inheritance
{
public static void main(String[] args)
{
int num,count=0;
System.out.println("Enter any number:");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
for( int i=1;i<=num;i++)
{
if(num%i==0)
{
count=count+1;
}
}
if(count==2)
{
System.out.println("Prime Number");
}else{
System.out.println("not a prime number");

}


Swapping i1=new Swapping();
i1.grade();
i1.swap();
} 
}



