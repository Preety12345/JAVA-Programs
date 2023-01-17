import java.awt.*;
class MyFrame extends Frame
{
MyFrame(String str)
{
super(str);
}
public static void main(String args[])
{
MyFrame f=new MyFrame("My first frame");
f.setSize(300,250);
f.setVisible(true);
}
}