import java.util.Scanner;
class ArrayAssignment
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an Array: ");
		int size = scan.nextInt();
		// Array A
		int a[] = new int[size];
		System.out.println("Enter an elements of Array A : ");
		for(int i = 0; i<size;i++)
		{
			
			a[i] = scan.nextInt();
		}
		System.out.println("Entered elements are : " );
		for(int i = 0; i<size;i++)
		{
			
			System.out.println(a[i]);
		} 
	
		
	 	// Elements are in Ascending Order 

		int temp;
		for(int i =0; i<size; i++)
		{	
			
			for(int j =0; j<size-1-i; j++)
			{
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j]=a[j+1];
					a[j+1] = temp;
					
				}
			}
		
				
		}
		System.out.println("Elements are in Ascending Order  : ");
		for(int i=0; i<size; i++)
		
		{
			
			System.out.println(a[i]);
		}
		

		// Elements are in Descending Order 
		int temp1;
		for(int i =0; i<size; i++)
		{	
			
			for(int j =0; j<size-1-i; j++)
			{
				if(a[j] < a[j+1])
				{
					temp1 = a[j];
					a[j]=a[j+1];
					a[j+1] = temp1;
					
				}
			}
		
				
		}
		System.out.println("Elements are in Descending Order  : ");
		for(int i=0; i<size; i++)
		
		{
			
			System.out.println(a[i]);
		}
		
		// Searching 
		int item; 
		System.out.println("Enter the value of Item : ");
		item = scan.nextInt();
		for (int i = 0; i<size; i++)
		{
			if(a[i]==item)
			{
				System.out.println("Element is present at :  " + i + "   Index Position");
			}
		}	
		

		
		// Insertion  
		
		int position; 
		System.out.println("Enter the value of position : ");
		position = scan.nextInt();
		int element;
		System.out.println("Enter the value of Element : ");
		element= scan.nextInt();

		for(int i=size-1; i>position-1; i--)
		{
			a[i]= a[i-1];
		}
		a[position-1]=element;
		System.out.println("Array after insertion of an element  : ");
		for (int i = 0; i<size; i++)
		{
			
			{
				System.out.println(a[i]);
			}
		}	

		// Deletion 
		int del_elm; 
		System.out.println("Enter the element which you want to delete  : ");
		del_elm = scan.nextInt();
		
		for(int i=0; i<size;i++)
		{
			if(del_elm==a[i])
			{
				for(int j =i; j<size-1;j++)
				{
					a[j]=a[j+1];
		
				}
				break; 
			}
		}
		System.out.println("Array after deletion of an element  : ");	
		for(int i =0; i<size-1;i++)
		{
			System.out.println(a[i]);
		}	
	}
}













