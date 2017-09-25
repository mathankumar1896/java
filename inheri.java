class sevel
{
void details()
{
System.out.println("dfg");
}}
class sree extends sevel
{

void details(int a)
{
System.out.println(a);
}
public static void main(String args[])
{
sree o=new sree();
o.details();

o.details(5);
}}