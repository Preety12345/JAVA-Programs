import java.lang.*;
import java.io.*;
interface Printer
{
void printit(String text);
void disconnect();
}
class IBMPrinter implements Printer
{
public void printit(String text)
{
System.out.println(text);
}
public void disconnect()
{
System.out.println("Printing completed");
System.out.println("Disconnected from IBM printer");
}
}
class EpsonPrinter implements Printer
{
public void printit(String text)
{
System.out.println(text);
}
public void disconnect()
{
System.out.println("Printing completed");
System.out.println("Disconnected from Epson printer");
}
}
class InterfaceUse
{
public static void main(String args[]) throws Exception
{
FileReader fr=new FileReader("config.txt");
LineNumberReader Inr=new LineNumberReader(fr);
String printername=Inr.readLine();
System.out.println("Loading the printer name:"+printername);
Class c=Class.forName(printername);
Printer obj=(Printer)c.newInstance();
obj.printit("Hello, This printed on the printer");
obj.disconnect();
}
}

