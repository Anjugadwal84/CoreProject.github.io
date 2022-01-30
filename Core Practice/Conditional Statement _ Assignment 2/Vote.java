import java.util.Scanner;
class Vote
{
	public static void main(String args[])
	{
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		age = scan.nextInt();
		System.out.println( "Entered Age  is : " + age);
		if(age>=18)
		{
			System.out.println("You are Eligible for Vote  : ");
		}
		else
		{
			System.out.println("Sorry! ...  you are not Eligible for Vote : ");
		}
	}
}