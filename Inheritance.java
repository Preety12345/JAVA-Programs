import java.lang.*;
class Shape
{
protected double a=8.0;
protected double b=4.5;
protected double c=6.5;
}
class Square extends Shape
{
public void display()
{
double areas=a*a;
System.out.println("The area of square=" +areas);
}
}
class Rectangle extends Shape
{
public void display()
{
double arear=b*c;
System.out.println("The area of rectangle=" +arear);
}
}
class Inheritance
{
public static void main(String args[])
{
Square obj1=new Suqare();
Rectangle obj2=new Rectangle();
obj1.display();
obj2.display();
}
}
