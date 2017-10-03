import java.util.*;
class sqtest
{
public static void main(String args[])
{
String name1,name2,name3,name4;
Scanner scan=new Scanner(System.in);
System.out.println("enter first name");
name1=scan.next();
System.out.println("enter sec name");
name2=scan.next();
System.out.println("enter three name");
name3=scan.next();
System.out.println("enter four name");
name4=scan.next();
char[] a=name1.toCharArray();
char[] b=name2.toCharArray();
char[] c=name3.toCharArray();
char[] d=name4.toCharArray();
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]);
}
if(a[0]==b[0])
{
for(int i=1;i<b.length;i++)
{
System.out.print("\n"+b[i]);
}}
if(b[b.length-1]==c[0])
{
for(int i=1;i<c.length;i++)
{
System.out.print(c[i]);
}}
if(a[a.length-1]==d[0] && c[c.length-1]==d[d.length-1])
{
for(int i=1;i<d.length;i++)
{
System.out.print(     "\n"    +d[i]);
}}}}