import java.lang.*;
class ThreadDemo
{
public static void main(String args[])
{
Thread t=Thread.currentThread();
System.out.println("Current thread=" +t);
System.out.println("Name=" +t.getName());
}
} 