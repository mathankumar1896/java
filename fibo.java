import java.util.*;
class fibo
{  
public static void main(String args[])  
{    
int n1,n2,n3,i,count;
Scanner scan=new Scanner(System.in);
n1=scan.nextInt();   
n2=scan.nextInt();    
count=scan.nextInt();    
System.out.println(n1+" "+n2);   
for(i=2;i<count;++i)
{
n3=n1+n2;    
System.out.println(n3); 
n1=n2;
n2=n3;   
}    
}}  