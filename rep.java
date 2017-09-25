import java.util.*;
class rep
{
public static void main(String args[])
{
String str;
int counter=0;
System.out.println("enter the name");
Scanner scan=new Scanner(System.in);
str=scan.next();
char[] x=str.toCharArray();
for(int i=0;i<str.length();i++)
{
for(int j=i+1;j<str.length();j++)
{
if(x[i]==x[j])
{
int k=(int)x[j];
int l=k-32;
char m=(char)l;
//System.out.println(x[j]);
System.out.println(m);

counter ++;
break;

}
}}
System.out.println(counter);}}