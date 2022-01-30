import java.util.Scanner;	
class Circle
{
	public static void main(String args[])
	{
		int r;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of r : ");
		r = s.nextInt();
		Double area = Math.PI*r*r;
		System.out.print(" Area of Circle is : " + area);

		
	}
}