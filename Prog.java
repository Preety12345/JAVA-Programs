import java.lang.*;
class Prog
{
public static void main(String args[])
{
if(args.length!=2)
{
System.out.println("please enter values:");
return;
}
String s1=args[0];
String s2=args[1];
double d1=Double.parseDouble(s1);
double d2=Double.parseDouble(s2);
double d3=d1+d2;
System.out.println("the sum="+d3);
}
}