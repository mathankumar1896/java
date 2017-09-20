import java.util.Scanner;
class addi
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();
if(a==13)
{
System.out.println(""+(c+d));
}
else if(b==13)
{
System.out.println(""+(d+a));
}
else if(c==13)
{
System.out.println(""+(a+b));
}
else if(d==13)
{
System.out.println(""+(b+c));
}
else 
{
System.out.println(""+(a+b+c+d));
}
}}