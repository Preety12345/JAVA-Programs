import java.util.*;
class Smark
{
    public static void main(String[] args) 
    {
        int  total = 0;
        Scanner s = new Scanner(System.in);
        int marks[] = new int[5];
        System.out.println("Enter marks:");
        for(int i = 0; i < 5; i++)
        {
            marks[i] = s.nextInt();
            total = total + marks[i];
        }
	System.out.println("Total marks :"+total);
}
}