import java.util.Scanner;	
class Rectangle
{
	public static void main(String args[])
	{
		int l, b, area;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of l : ");
		l = s.nextInt();
		System.out.print("Enter the value of b : ");
		b = s.nextInt();
		area = l*b;
		System.out.print(" Area of Circle is : " + area);

		
	}
}