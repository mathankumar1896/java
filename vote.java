import java.util.Scanner;
class vote
{
public static void main(String args[])
{
try
{
int num;
Scanner age=new Scanner(System.in);
num=age.nextInt();
if(num<=17)
{
System.out.println("not eligible to vote");

}
else
{
System.out.println("eligible to vote");
}}
catch(Exception obj)
{
System.out.println("enter a number");
}
}}