import java.lang.*;
import java.util.*;
class OddOrEven
{
public static void main(String args[])
{
int x;
System.out.println("Enter a number");
Scanner s=new Scanner(System.in);
x=s.nextInt();
if(x % 2==0)
System.out.println("The is an even number");
else
System.out.println("The is an odd number");
}
}