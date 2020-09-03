package oppsProgram;

public class Department {
	
	String departmentName, hodName;
	

	public Department(	String departmentName, String hodName)
	{
		this.departmentName=departmentName;
		this.hodName=hodName;
	}
	
	public void showDeptDetails()
	{
		System.out.println("Department Details : \n");
		
		System.out.println("The Department Name is : "+departmentName);

		System.out.println("The Head Of Department Name is : "+hodName);

	}
	
}
