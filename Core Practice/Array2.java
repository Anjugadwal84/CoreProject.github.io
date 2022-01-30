import java.util.Scanner;
class Array2
{
	public static void main(String args[])
	{
		int a[]= new int [10];
		int b[]= new int [10];
		int c[]= new int [10];
		Scanner sc = new Scanner(System.in);
		//Array A
		System.out.println("Enter the numbers for A :"); 
		for(int i = 0; i<10;i++)
		
		{	
			
			a[i] = sc.nextInt();
			
		}
		System.out.print("You have entered numbers for A : ");
		for(int i=0;i<10;i++)
		{
			
			System.out.println("\n" +a[i]);
			
			
		}


		//Array B
		System.out.println("Enter the numbers for B :");
		for(int j = 0; j<10;j++)
		{	
			
			b[j] = sc.nextInt();
		}
		System.out.print("You have entered numbers for B : ");	
		
		for(int j=0; j<10;j++)
		{
			
			System.out.println("\n" +b[j]);
		}
		
		
	}
}