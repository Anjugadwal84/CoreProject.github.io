import java.util.Scanner;
class SwitchWeek
{
	public static void main(String args[])
	{
		int day;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number between 1-7 :");
		day = s.nextInt();	
		switch(day)
		{
			Case 1 :
			System.out.println("Sunday ");
			break;
			
			Case 2 :
			System.out.println("Monday ");
			break;
			
			Case 3 :
			System.out.println("Tuesday ");
			break;
				
			Case 4 :
			System.out.println("Wednesday ");
			break;
				
			Case 5 :
			System.out.println("Thursday ");
			break;
				
			Case 6 : 
			System.out.println("Friday");
			break;
				
			Case 7 :
			System.out.println("Saturday");
			break;
			
			default :
			System.out.println("Invalid Day ");
		}		
	}
}