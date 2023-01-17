import java.lang.*;
class Sample
{
void add(int a, int b)
{
System.out.println("Sum of two="+(a+b));
}
void add(int a, int b, int c)
{
System.out.println("Sum of three="+(a+b+c));
}
}
class Overloading
{
public static void main(String args[])
{
Sample s=new Sample();
s.add(10,5);
s.add(10,5,5);
}
}