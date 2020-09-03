package oppsProgram;

import java.util.Scanner;

public class DepartmentMain {

	public static void main(String[] args) {

		String departmentName, hodName, memberName, memberQualification;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Name of Department :\n ");
		departmentName=sc.next();
		
		System.out.println("Enter the Head of Department Name : ");
		hodName=sc.next();
		
		System.out.println("Enter the Staff Member Name  : ");
		memberName=sc.next();
		
		System.out.println("Enter the Staff Member Qualification : ");
		memberQualification=sc.next();
		
		Department d=new Department(departmentName, hodName);
		
		d.showDeptDetails();
		
		StaffMember sm=new StaffMember(memberName, memberQualification);
		
		sm.showMemberDetails();
		
		
	}

}
