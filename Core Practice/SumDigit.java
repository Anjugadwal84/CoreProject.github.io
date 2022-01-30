import java.util.Scanner;
class SumDigit
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int no= scan.nextInt();
		System.out.println("Entered number is : " + no);
		int sum = 0;
		int rem =0;
		while(no > 0)
		{
			rem = no%10;
			sum = sum + rem;
			no = no/10;
		}
		 System.out.println("The sum of digit is : " + sum );
	}
}