import java.lang.*;
import java.io.*;
class ExceptionDemo
{
public static void main(String args[])
{
System.out.println("Open file");
int n=args.length;
System.out.println("n="+n);
int a=45/n;
System.out.println("a="+a);
System.out.println("Close files");
}
}