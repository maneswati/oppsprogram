package oppsProgram;

import java.util.Scanner;

public class TraineeActivity {
	

	public static void main(String[] args) {
		
		Long id;
		
		String name,  address, phoneno;
		 Double salary = 0.0;
		
		Scanner sc=new Scanner(System.in);

		
		System.out.println("Enter The Id :");
		id=sc.nextLong();
		
		System.out.println("Enter The Name :");
		name=sc.next();
		
		
		System.out.println("Enter The Address :");
		address=sc.next();
		
		System.out.println("Enter The Phone Number :");
		phoneno=sc.next();
		
		new Employees(id, name, address, phoneno);
	
		Managers mg=new Managers(id, name, address, phoneno, salary);
		mg.calculateTransportAllownce();
	
		Trainee t=new Trainee(id, name, address, phoneno, salary);
		t.calculateSalary();
		t.calculateTransportAllownce();
		t.showDepartmentDetails();
		t.showManagerDetails();
		t.showTraineeDetails();
	}
	

}
