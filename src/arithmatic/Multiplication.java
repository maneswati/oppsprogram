package arithmatic;

public class Multiplication extends Addition {

	

	public void multiply()
	{
		System.out.println("\n Enter any Number For Multiplication :\n");

		System.out.println("Enter the First Number : ");
		num1=sc.nextInt();
		
		System.out.println("Enter the Second Number : ");
		num2=sc.nextInt();
		
		result=num1*num2;
		
		System.out.println("The  Addition of Two Numbers is : "+result);

	}

}
