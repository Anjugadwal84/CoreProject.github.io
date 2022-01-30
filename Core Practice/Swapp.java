import java.util.Scanner;
class Swap
{
	public static void main(String args[])
	{
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of A :");
		a=s.nextInt();
		System.out.print("Enter the value of B :");
		b=s.nextInt();
		c=a+b;
		a=c-a;
		System.out.println("the value of A :" +a);
		b=c-b;
		System.out.print("the value of B :" +b);
	}	
}