import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		int a[]= new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers :");
		for(int i = 0; i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("Enter numbers: ");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
}