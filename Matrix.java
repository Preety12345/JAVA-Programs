import java.util.*;
class Matrix
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter rows and coloums:");
int r=sc.nextInt();
int c=sc.nextInt();
int arr[][]=new int[r][c];
System.out.println("enter elements of matrix:");

for(int i=0; i<r; i++)
for(int j=0; j<c; j++)
arr[i][j]=sc.nextInt();
System.out.println("The transpose of matrix");

for(int i=0; i<c; i++)
{
for(int j=0; j<r; j++)
{
System.out.print(arr[j][i]+"");
}
System.out.print("\n");
}
}
}