import java.lang.*;
import java.io.*;
class ExceptionDemo2
{
public static void main(String args[])
{
try
{
System.out.println("Open file");
int n=args.length;
System.out.println("n="+n);
int a=45/n;
System.out.println("a="+a);
}
catch(ArithmeticException ae)
{
System.out.println(ae);
System.out.println("Please pass data while running this program");
}
finally
{
System.out.println("Close files");
}
}
}