import java.util.Scanner;	
class Greater
{
	public static void main(String args[])
	{
		int a, b, c; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		a = s.nextInt();
		System.out.print("Enter the value of b: ");
		b = s.nextInt();
		System.out.print("Enter the value of c: ");
		c = s.nextInt();
		
		if(a>b)
		{
		    	 if(a>c)
		  	  {
				System.out.print("A is greater : " +a);
		   	 }
			   else 
			  {
				System.out.print("C is greater : " +c);
    			  }
	
		}	
		if(b>c)
		{
			System.out.print("B is greater : " +b);
		}

			
	}
}