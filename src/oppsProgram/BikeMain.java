package oppsProgram;

public class BikeMain {

	public static void main(String[] args) {

		Vehicle v=new Vehicle();
		Bike b1=new Bike();

		Vehicle v1=new Vehicle();
		v1.display();
		
		Bike b=new Bike();
		//b.discount();
		b.display();
		b.discount();
		
	}

}
