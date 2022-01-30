import java.util.Scanner;
class ArrayElementSum
{
	public static void main(String args[])
	{
		int a[]= new int [10]; 
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers :");
		for(int i = 0; i<10;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Entered numbers are : ");
		for(int i=0;i<10;i++)
		{
			System.out.println(a[i]);
			sum = a[i]+sum;
		}
		System.out.println("Sum of Array Elements : " +sum);
	}
}