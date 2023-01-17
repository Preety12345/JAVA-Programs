import java.util.*;
import java.io.*;
class Array
{
public static void main(String args[])
{
String s,s1,ss;
int l,l1,m=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
s=sc.nextLine();
System.out.println("Enter string to search");
ss=sc.nextLine();
l=s.length();
l1=ss.length();
for(int i=0;i<1,i++)
{
if(s[i]==ss[0]
{
s1=s.substring(i,(i+l1);
if(equalsIgnoreCase(s1,ss)==true)
{
System.out.println("found at"+(i+1)+" position");
m++;
}
}
}
if(m==0)
System.outprintln("not found");
}
}