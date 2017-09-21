import java.util.*;
class opt
{
public static void main(String args[])
{
int a,b;

Scanner s=new Scanner(System.in);
System.out.println("enter char option");
char  x=s.next().charAt(0);
System.out.println("enter a b values");
a=s.nextInt();
b=s.nextInt();
switch(x)
{
case '*':System.out.println(a%b);break;
case '-':System.out.println(a*b);break;
case '+':System.out.println(a+b);break;
case '/':System.out.println(a-b);break;
case '%':System.out.println(a/b);break;
default:System.out.println("enter correct value");
}}}

