import java.lang.*;
class One
{
void calculate(double x)
{
System.out.println("Square value="+(x*x));
}
}
class Two extends One
{
void calculate(double x)
{
System.out.println("Square root="+Math.sqrt(x));
}
}
class Overwritten
{
public static void main(String args[])
{
Two s=new Two();
s.calculate(25);
}
}