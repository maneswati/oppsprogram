package oppsProgram;

public class Managers extends Employees{

	Managers(Long id, String name, String address, String phoneno, Double salary) {
		super(id, name, address, phoneno);
		
		empId=id;
		
		empName=name;
		
		empAddress=address;
		
		empPhone=phoneno;
		
		basicSal=salary;
		
	}
	public void calculateTransportAllownce()
	{
		
		Double transportAllowance = 15*basicSal/100.;

		
		System.out.println("The Transport Allownce of Manager : "+transportAllowance);

	}
	

	public void showManagerDetails()
	{
		System.out.println("Manager Information :");
		System.out.println("The Id of Manager is : "+empId);

		System.out.println("The Name of Manager is : "+empName);

		System.out.println("The Address of Manager is : "+empAddress);

		System.out.println("The Phone Number of Manager is : "+empPhone);

		System.out.println("The Basic Salary of Manager is : "+basicSal);

		

	}


	

	
}
