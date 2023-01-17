import java.io.*;
class Person
{
private string name;
private int age;
Person(String s,int i)
{
name=s;
age=i;
}
public void check()
{
if(age<=30)
System.out.println(name+"is young");
elseif(age<=50);
System.out.println(name+"is middle aged");
else
System.out.println(name+"is old");
}
}
class Demo2
{
public static void main(Strigs args[])throws IOException
{
BufferedReader br=new BufferedReader(new inputStreamReader(System.in));
String s=args[0];
int i=Integer.perseInt(args[1]);
Person p=new Person(s,i);
p.check();
}
}