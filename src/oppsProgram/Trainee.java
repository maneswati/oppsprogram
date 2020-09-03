package oppsProgram;

public class Trainee extends Managers {

	public Trainee(Long id, String name, String address, String phoneno, Double salary) {
		super(id, name, address, phoneno, salary);

	
		empId=id;
		
		empName=name;
		
		empAddress=address;
		
		empPhone=phoneno;
		
		basicSal=salary;
	}
	public void calculateTransportAllownce()
	{
		
		Double ta = 10/100*basicSal;
		
		System.out.println("The Transport Allownce of Trainee : "+ta);

	}
	

	public void showTraineeDetails()
	{
		System.out.println("Trainee Information :");
		System.out.println("The Id of Trainee is : "+empId);

		System.out.println("The Name of Trainee is : "+empName);

		System.out.println("The Address of Trainee is : "+empAddress);

		System.out.println("The Phone Number of Trainee is : "+empPhone);

		System.out.println("The Basic Salary of Trainee is : "+basicSal);


	
		}

	
	
	

}