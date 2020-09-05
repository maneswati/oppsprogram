package arithmatic;

import java.util.Scanner;

public class Addition {

	int num1, num2,result;
	
	Scanner sc=new Scanner(System.in);
	
	public void addition()
	{
		System.out.println("Enter any Number For Addition :");
		
		System.out.println("Enter the First Number : ");
		num1=sc.nextInt();
		
		System.out.println("Enter the Second Number : ");
		num2=sc.nextInt();
		
		result=num1+num2;
		
		System.out.println("The  Addition of Two Numbers is : "+result);
	}
}
