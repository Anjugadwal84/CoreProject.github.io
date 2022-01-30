import java.util.Scanner;	
class Cube
{
	public static void main(String args[])
	{
		Double a, cube;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		a = s.nextDouble();
		cube= a*a*a;
		System.out.print("Cube of a number is : " +cube);

		
	}
}