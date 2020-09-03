package oppsProgram;

public class FinalKeyword {
	
	
		final int num1 = 5;
		void sum()
	
		{
			System.out.println(num1);
			
			int result=num1+num1;
			System.out.println("The Addition is :"+result);

		}
		
		final void addition()
		{
			System.out.println("number is : "+num1);
			
			int result=num1+num1;
			System.out.println("The Addition is :"+result);

			
		}
		

	public static void main(String[] args) {
		
		FinalKeyword f=new FinalKeyword();
		f.sum();
		f.addition();

	}

}
