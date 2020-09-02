package oppsProgram;

import java.util.Scanner;

public class Worker {
	
	String sname, saddress, sphoneno;
	int sage, ssalary, da,hra;
	
	Scanner sc=new Scanner(System.in);

	void displaySalary()
	{
		
		System.out.println("Enter Employee Name : ");
		sname=sc.next();
		
		System.out.println("Enter Employee Address : ");
		saddress=sc.next();
		
		System.out.println("Enter Employee Phone Number : ");
		
		sphoneno=sc.next();
		
		System.out.println("Enter Employee Age : ");
		sage=sc.nextInt();
		
		System.out.println("Enter the DA of Employee : ");
		da=sc.nextInt();
		
		System.out.println("Enter  the HRA of Employee : ");
		hra=sc.nextInt();

		ssalary=da*hra;
		
	}
}
