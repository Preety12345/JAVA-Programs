import java.lang.*;
class MyThread implements Runnable
{
String str;
MyThread(String str)
{
this.str=str;
}
public void run()
{
for(int i=1; i<=10; i++)
{
System.out.println(str+":" +i);
try
{
Thread.sleep(2000);
}
catch(InterruptedException exc)
{
exc.printStackTrace();
}
}
}
}
class MultiThread
{
public static void main(String args[])
{
MyThread obj1=new MyThread("Cut the ticket");
MyThread obj2=new MyThread("Show the seat");
Thread thrd=new Thread(obj1);
Thread thrd1=new Thread(obj2);
thrd.start();
thrd1.start();
}
}