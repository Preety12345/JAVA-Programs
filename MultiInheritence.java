import java.lang.*;
import java.io.*;
interface Father
{
float HT=6.2f;
void height();
}
interface Mother
{
float HT=5.8f;
void height();
}
class Child implements Father,Mother
{
public void height()
{
float ht=(Father.HT+Mother.HT)/2;
System.out.println("childs height="+ht);
}
}
class MultiInheritence
{
public static void main(String args[])
{
Child ch=new Child();
ch.height();
}
}