import java.lang.*;
class One
{
static void calculate(double x)
{
System.out.println("Square value="+(x*x));
}
}
class Two extends One
{
static void calculate(double x)
{
System.out.println("Square root="+Math.sqrt(x));
}
}
class Method
{
public static void main(String args[])
{
One s=new Two();
s.calculate(25);
}
}