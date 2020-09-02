package oppsProgram;

public class Rectangle extends Square {
	
	float length, breadth;
	
	 public Rectangle()
	 {
		 
	 }
	 
	 public void area()
	 {
		 System.out.println("Enter the Value of Rectangle Length : ");
		 length=sc.nextFloat();
		 
		 System.out.println("Enter the Value of Rectangle Breadth : ");
		 breadth=sc.nextFloat();
	
		 float area=length*breadth;
		 System.out.println("The area of Rectangle is : "+area);
	 }
}
