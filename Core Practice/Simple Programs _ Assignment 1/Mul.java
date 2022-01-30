import java.util.Scanner;	
class Mul
{
	public static void main(String args[])
	{
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of A: ");
		a = s.nextInt();
		System.out.print("Enter the value of B: ");
		b = s.nextInt();
		c= a*b;
		System.out.print(" Multiplication is : " + c);

		
	}
}