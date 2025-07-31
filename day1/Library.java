package week2.day1;

public class Library {
	
	//creating method with string return type
    public String addBook(String bookTitle)
    {
		
    	System.out.println("Book Added Succesfully");
    	return bookTitle;
    	
    }
    //creating a method with return type
    public void issueBook()
    {
    	System.out.println("Book issued Succesfully");
    }

	public static void main(String[] args)
	{
		//creating a object using class name 
        Library books = new Library();
        String booksname = books.addBook("Harry Potter");
        System.out.println(booksname);
        books.issueBook();
		
	}

}
