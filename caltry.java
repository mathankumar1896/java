import java.util.*;
class caltry
{
public static void main(String args[])
{
int n1,n2,n=0;
Scanner obj=new Scanner(System.in);
System.out.println("enter how many number want to add");
n2=obj.nextInt();
for(int i=1;i<=n2;i++)
{
//Scanner o=new Scanner(System.in);
System.out.println("enter number");
n1=obj.nextInt();
n=n+n1;
System.out.println(n);
}}}