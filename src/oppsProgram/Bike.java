package oppsProgram;

public class Bike extends Vehicle {
		
		int discountRate;
	
		public Bike()
		{
			
		}
		
		public void discount()
		{
			discountRate=vprice-((vprice/100)*5);
			System.out.println("The Discount Price of Bike : "+discountRate);

		}
		
		public void display()
		{
			input();
			
			System.out.println("The Name of Bike : "+vname);

			System.out.println("The Model Number of Bike : "+vmodelno);

			System.out.println("The Service Station of Bike : "+vservicename);

			System.out.println("The Price of Bike : "+vprice);
			

			

		}
		

		

}
