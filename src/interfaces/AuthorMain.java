package interfaces;

import java.util.Scanner;

public class AuthorMain {
	
	public static void main(String[] args) {


		String name,place;
		int age;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Author Name is :");
		name=sc.next();
		
		System.out.println("Enter Author Age is :");
		age=sc.nextInt();
		
		System.out.println("Enter Author Place is :");
		place=sc.next();
		
		
		Author a=new Author(name, age, place);
		
		System.out.println("\n System Information :\n");
		a.setName("E Balagurusamy");
		a.setAge(34);
		a.setPlace("Pune");
		
		System.out.println("Author Name is : "+a.getName());
		
		System.out.println("Author Age is : "+a.getAge());

		System.out.println("Author Place is : "+a.getPlace());
		
		

	}

}
