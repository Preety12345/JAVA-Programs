import java.lang.*;
class Person
{
private String name="Ved";
private int age=21;
void talk()
{
System.out.println("name is" +name);
System.out.println("Age is" +age);
}
}
class Demo
{
public static void main(String args[])
{
Person Raj=new Person();
Raj.talk();
Person Harry=new Person();
Harry.talk();
}
}
