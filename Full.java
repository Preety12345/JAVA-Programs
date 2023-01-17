import java.io.*;
class Full
{
public static void main(String args[])throws IOException
{
StringBuffer sb=new StringBuffer();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter surname-");
String sur=br.readLine();
System.out.println("Enter midname-");
String mid=br.readLine();
System.out.println("Enter lastname-");
String last=br.readLine();
sb.append(sur);
sb.append(last);
System.out.println("Name:" +sb);
int n=sb.length();
sb.insert(n,mid);
System.out.println("Full Name:" +sb);
System.out.println("In reverse:" +sb.reverse());
}
}


