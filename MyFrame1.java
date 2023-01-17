import java.awt.*;
import java.awt.event.*;
class MyFrame1 extends Frame
{
public static void main(String args[])
{
MyFrame1 f=new MyFrame1();
f.setTitle("My first frame");
f.setSize(300,250);
f.setVisible(true);
f.addWindowListener(new MyClass());
}
}
class MyClass extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}
//f.addWindowListener(new Window Adapter)
{
public void windowCLosing(WindowEvent e)
{
System.exit(0);
}
}
}//