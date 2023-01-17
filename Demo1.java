import java.lang.*;
class Person
{
private String name;
private int age;
Person()
{
name="Raju";
age=22;
}
Person(String s,int i)
{
name=s;
age=i;
}
void talk()
{
System.out.println("Hello i am"+name);
System.out.println("My age is"+age);
}
}
class Demo1
{
public static void main(String args[])
{
Person Raj=new Person();
Raj.talk();
Person Harry=new Person("Harry",20);
Harry.talk();
}
}