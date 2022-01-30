import java.util.Scanner;
class Seclarge
{
	public static void main(String args[])
	{
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of A : ");
		a = s.nextInt();
		System.out.print("Enter the value of B : ");
		b = s.nextInt();
		System.out.print("Enter the value of C : ");
		c = s.nextInt();
		if(a>b&&a>c)
		{
			 if(b>c)
			{
				System.out.print("B is second greater : " +b);
			}
			else 
			{
				System.out.print("C is second greater : " +c);
			}
		 	
		}


		if(b>a&&b>c)
		{
			 if(a>c)
			{
				System.out.print("A is second greater : " +a);
			}
			else 
			{
				System.out.print("C is second greater : " +c);
			}
		 	
		}

		if(c>a&&c>b)
		{
			 if(b>a)
			{
				System.out.print("B is second greater : " +b);
			}
			else 
			{
				System.out.print("A is second greater : " +a);
			}
		 	
		}
			 
		 
	   }	
}
				

	