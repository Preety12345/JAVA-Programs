import java.lang.*;
class MyThread extends Thread
{
public void run()
{
for(int i=1; i<10; i++)
{
System.out.println(i);
}
}
}
class ThreadDemo2
{
public static void main(String args[])
{
MyThread obj=new MyThread();
Thread t=new Thread(obj);
t.start();
}
}
