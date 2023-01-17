import java.io.*;
import java.lang.*;
class Swap
{
public static int a, b, c;
Swap(int a, int b)
{
this.a=a;
this.b=b;
}
public static void main(String args[])
{
Swap ob=new Swap(5,6);
System.out.println("a= "+ob.a+" b= "+ob.b);
c=ob.a;
ob.a=ob.b;
ob.b=ob.c;
System.out.println("Swapped Value:");
System.out.println("a= "+ob.a+" b= "+ob.b);
}
}