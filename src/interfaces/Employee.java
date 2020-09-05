package interfaces;

import java.util.Scanner;

public class Employee {
	
		private int id;
		private String name;
		
		Scanner sc=new Scanner(System.in);
		
		public int getId() {
			
			System.out.println("Enter the Employee ID : ");
			id=sc.nextInt();
			
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {

			System.out.println("Enter the Employee Name : ");
			name=sc.next();
			
			
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		

}
