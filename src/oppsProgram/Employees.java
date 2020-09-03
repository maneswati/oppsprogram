package oppsProgram;

import java.util.Scanner;

public class Employees {
	 
	Long empId;
	String empName, empAddress, empPhone;
	Double basicSal, specialAllownce=250.80, hra=1000.50;

	 Employees(Long id, String name, String address, String phoneno)
	{
		empId=id;
		
		empName=name;
		
		empAddress=address;
		
		empPhone=phoneno;
	}
	
	public void calculateSalary()
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the basic salary : ");
		basicSal=s.nextDouble();
		
		Double salary= basicSal+(basicSal+ 250.80/100)+(basicSal*1000.50/100);
		
		System.out.println("Total Salary : "+salary);
	}
	
	public void calculateTransportAllownce()
	{
		Double transportAllowance = 10/100*basicSal;

		
		System.out.println("The Transport Allownce of Employee : "+transportAllowance);

	}
	
	public void showDepartmentDetails()
	{
		System.out.println("The Id of Employee is : "+empId);

		System.out.println("The Name of Employee is : "+empName);

		System.out.println("The Address of Employee is : "+empAddress);

		System.out.println("The Phone Number of Employee is : "+empPhone);

		System.out.println("The Basic Salary of Employee is : "+basicSal);

		//System.out.println("The Id of Employee is : "+empId);

	}
	
	
	
	
}
