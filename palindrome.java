import java.util.*;
class palindrome
{
public static void main(String args[])
{
String name,reversename="";
Scanner scan=new Scanner(System.in);
System.out.println("enter name");
name=scan.nextLine();
char[] x=name.toCharArray();
for(int i=x.length-1;i>=0;i--)
{
reversename=reversename+x[i];
}
if(name.equals(reversename))
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}}

