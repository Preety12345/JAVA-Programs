import java.io.*;
class Sample
{
private String name;
void accept() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Name:");
name=br.readLine();
}
void display()
{
System.out.println("Name:"+name);
}
}
class Exc
{
public static void main(String args[]) throws IOException
{
Sample obj=new Sample();
obj.accept();
obj.display();
}
}
