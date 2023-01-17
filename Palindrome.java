import java.io.*;
import java.util.*;
class Palindrome
{
public static void main(String args[])
{
String Strings = "Preety";
StringBuffer buffer = new StringBuffer(Strings);
buffer.reverse();
String data = buffer.toString();
if(Strings.equalsIgnoreCase(data))
{
System.out.println("Given String is palindrome");
}
else
{
System.out.println("Given String is not palindrome");
}
}
}