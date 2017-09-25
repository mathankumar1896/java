import java.util.*;
public class StringRepeat
{
public static void main(String [] args)
{
 
String str;
int counter=0;
int upper=0;
Scanner scan=new Scanner(System.in);
str=scan.next();
char [] ctr=str.toCharArray();
System.out.println("The repeated letters are");
 
for(int i=0;i<str.length();i++)
{
for(int j=i+1;j<str.length();j++)
{
if(ctr[i] == ctr[j])
{
int k=(int)ctr[j];
int m=k-32;
char l=(char)m;
 System.out.println(ctr[j]);
System.out.println(l);
counter ++;
break;
}
}
}
}
}