import java.util.Scanner;
class ArraySum

{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an Array: ");
		int size = scan.nextInt();
		// Array A
		int a[] = new int[size];
		System.out.println("Enter an elements of Array A : ");
		for(int i = 0; i<size;i++)
		{
			
			a[i] = scan.nextInt();
		}
		System.out.println("Entered elements are : " );
		for(int i = 0; i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
		
		// Array B
		int b[] = new int[size];
		System.out.println("Enter an elements of Array B : ");
		for(int i= 0; i<size;i++)
		{
			
			b[i] = scan.nextInt();
		}
		System.out.println("Entered elements are : " );
		for(int i = 0; i<b.length;i++)
		{
			
			System.out.println(b[i]);
		}

		int sum[] = new int[size];
		System.out.println("The sum of an array :" );
		for(int i= 0; i<size;i++)
		{
			
			sum[i] = a[i]+b[i];
		}
		
		for(int i = 0; i<sum.length;i++)
		{
			
			System.out.println(sum[i]);
		}
		
		
		 
	}
}