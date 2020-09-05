package interfaces;

public class Author {
	
	private String name, place;
	private int age;
	
	public Author(String name, int age, String place)
	{
		
		this.name=name;
		this.age=age;
		this.place=place;
		
		System.out.println("User Entered Information  :\n");

		System.out.println("Author Name  : "+this.name);
		
		System.out.println("Author Age  : "+this.age);
		
		System.out.println("Author Place  : "+this.place);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
