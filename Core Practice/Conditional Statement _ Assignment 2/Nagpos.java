import java.util.Scanner;	
class Nagpos
{
	public static void main(String args[])
	{
		int a; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		a = s.nextInt();
		
		if(a<0)
		{
			System.out.print("No. is Negative : " +a);	
		}
		else if(a>0)
		{
			System.out.print("No. is Positive :" +a);	
		}
		else if(a==0)
		{
			System.out.print("No. is Zero:" +a);	
		}

	}		
}
		
