import java.lang.*;
class Switch
{
public static void main(String args[])
{
int a=10, b=20, f=1;
int i, sw, c;
int choice=3;
switch(choice)
{
	case 1:
	c=a+b;
	System.out.println("Addition:" +c);
break;
	case 2:
	for(i=1; i<=a; i++)
	{
	f=f*i;
	}
	System.out.println("the factorial value:" +f);
break;
	case 3:
	sw=a;
	a=b;
	b=sw;
	System.out.println("after swaping" +a+b);
break;
default: System.out.println("wrong");
break;
}
}
}
	
	
