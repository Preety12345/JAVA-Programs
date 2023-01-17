import java.io.*;
class MyThread extends Thread
{
boolean stop=false;
public void run()
{
for(int i=1; i<=1000; i++)
{
System.out.println(i);
if(stop)
return;
}
}
}
class StopThread
{
public static void main(String args[]) throws IOException
{
MyThread obj=new MyThread();
Thread t=new Thread(obj);
t.start();
System.in.read();
obj.stop=true;
}
}