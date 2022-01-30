import java.util.Scanner;	
class Even
{
	public static void main(String args[])
	{
		int n; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		n = s.nextInt();
		if(n%2==0)
		{
			System.out.print("Number is Even :" +n);
		}
		
		else 
		{
			System.out.print("Number is Odd:" +n);
		}
		
	}
}