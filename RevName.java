import java.util.*;
class RevName
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Name:");
String name=s.nextLine();
char[] ch=name.toCharArray();
for(int i=ch.length-1;i>=0;i--)
{
System.out.print(ch[i]);
}
}}
