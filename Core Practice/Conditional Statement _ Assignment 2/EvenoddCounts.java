import java.util.Scanner;
class EvenoddCounts
{
	public static void main(String args[])
	{
		int no, i, evencount=0, oddcount=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number :");
		no= s.nextInt();
		for(i=1;i<=no;i++)
		{
			if(i%2==0)
			{
				
				evencount++;
			}	
			
			else
			{
				
				oddcount++;
			}
					
		}
			System.out.println("The Sum of Even Numbers : " +evencount);
			System.out.println("The Sum of Odd Numbers  : " +oddcount);
	}
}