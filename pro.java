import java.util.*;
import java.io.*;
class pro
{
public static void main(String[] args)
{
try
{
FileOutputStream fout=new FileOutputStream("C:\\Users\\Mathan\\Documents\\java\\demo\\set &list\\mathu.txt");
FileOutputStream fout1=new FileOutputStream("C:\\Users\\Mathan\\Documents\\java\\demo\\set &list\\mathan.txt");
String name="";
System.out.println("enter 5 names");
Scanner scan=new Scanner(System.in);
for(int i=0;i<5;i++)
{
name=scan.next();
char[] x=name.toCharArray();

if(x[0]=='a'||x[0]=='e'||x[0]=='i'||x[0]=='o'||x[0]=='u')
{
System.out.println(name);
byte[] b=name.getBytes();
fout.write(b);

System.out.println("success");
}
else
{
System.out.println("consonant   "  +name);
byte[] c=name.getBytes();
fout1.write(c);

System.out.println("ok");
}

}
fout.close();
fout1.close();}
catch(IOException e)
{
System.out.println(e);
}

}}