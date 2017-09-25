import java.util.*;
class swap 
{
public static void main(String a[]){
int x;
int y;
Scanner scan=new Scanner(System.in);
x=scan.nextInt();
y=scan.nextInt();
System.out.println("Before swap:");
System.out.println("x value: "+x);
System.out.println("y value: "+y);
x = x+y;
y=x-y;
x=x-y;
System.out.println("After swap:");
System.out.println("x value: "+x);
System.out.println("y value: "+y);
}
}