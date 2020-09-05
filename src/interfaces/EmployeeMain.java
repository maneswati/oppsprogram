package interfaces;

public class EmployeeMain {

	public static void main(String[] args) {

		
		Employee emp=new Employee();
		
		emp.setId(123);
		
		System.out.println("Employee Id : "+emp.getId());
		
		emp.setName("Swati");
		
		System.out.println("Employee Name : "+emp.getName());

	}
	

}
