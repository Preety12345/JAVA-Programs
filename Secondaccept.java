import java.io.*;
class Empdata
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter id:");
int id=integer.parselnt(br.readLine));
System.out.print("Enter gender(M/F):");
char gender=(char)br.read();
System.out.print("Enter a name");
String name=br.readLine();
System.out.println("id" +id);
System.out.println("gender" +gender);
System.out.println("name" +name);
}
}
