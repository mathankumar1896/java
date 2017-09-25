class DiamondPattern
{
public static void main(String args[])
{
for(int i=0;i<=4;i++)
{
for(int j=0;j<=4;j++)
{
System.out.print("");
}
for(int j=1;j<=i*2-1;j++)
{
System.out.print("*");
}
System.out.println();
}}}