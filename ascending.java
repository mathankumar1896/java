import java.util.*;
class ascending
{
public static void main(String[] names)
{
String [] name=new String[5];
Scanner o=new Scanner(System.in);
System.out.println("enter 5 names");
for(int i=0;i<=4;i++)
{
name[i]=o.next();
}
for(int i=0;i<=4;i++)// or name.length
{
for(int j=i+1;j<=name.length-1;j++)
{
if(name[i].compareTo(name[j])>0)
{
String name1=name[i];
name[i]=name[j];
name[j]=name1;
}}}
//after sorting print sorted words
for(int i=0;i<name.length;i++)
{
System.out.println(name[i]);
}}}