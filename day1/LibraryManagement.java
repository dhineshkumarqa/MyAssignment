package week2.day1;

public class LibraryManagement {

	public static void main(String[] args)
	{
	    //create a object using previous class name and call the methods
		Library callBooks = new Library();
		String Bookname = callBooks.addBook("Rich dad Poor dad");
		System.out.println(Bookname);
		callBooks.issueBook();

	}

}
