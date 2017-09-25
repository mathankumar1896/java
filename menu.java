import java.util.*;
class menu
{
public static void main(String args[])
{
int choice;
int a,b;
Scanner scan=new Scanner(System.in);
System.out.println("enter choice val");
choice=scan.nextInt();
System.out.println("enter a b value");
a=scan.nextInt();
b=scan.nextInt();
switch(choice)
{
case 1:System.out.println(a+b);break;
case 2:System.out.println(a-b);break;
case 3:System.out.println(a*b);break;
case 4:System.out.println(a/b);break;
default:System.out.println("enter correct value");
}}}
