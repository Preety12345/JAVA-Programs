class Access
{
private int a;
protected int b;
}
class Sub extends Access
{
public void get()
{
System.out.println(a);
System.out.println(b);
}
}
class Test
{
public static void main(String args[])
{
sub s=new sub();
s.get();
}
}