package interfaces;

public class Book {
	
	private String bname, author;
	
	private float price;
	
	public Book(String bname, String author, float price)
	{
		
		this.bname=bname;
		this.author=author;
		this.price=price;
		
//		System.out.println("Book Name is :"+this.bname);
//		
//		System.out.println("Book Name is :"+this.author);
//
//		System.out.println("Book Name is :"+this.price);

	}

	public String getName() {
		return bname;
	}

//	public void setName(String name) {
//		this.bname = name;
//	}

	public String getAuthor() {
		return author;
	}

//	public void setAuthor(String author) {
//		this.author = author;
//	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}
