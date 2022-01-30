import java.util.Scanner;	
class Div
{
	public static void main(String args[])
	{
		Double a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of A: ");
		a = s.nextDouble();
		System.out.print("Enter the value of B: ");
		b = s.nextDouble();
		c= a/b;
		System.out.print(" Division is : " + c);

		
	}
}