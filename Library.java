package day2_assignment;

public class Library {
	
	
	public String addbook(String bookTitle)
	{
		System.out.println("Title of Book: "+bookTitle);
		
		return bookTitle;
		
	}
	
	public void issuebook(String issueBook)
	
	{
	System.out.println(issueBook+" Book Issued Successfully");	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String BookTitle= "Wings of Fire";
		Library book= new Library();
		book.addbook(BookTitle);
		book.issuebook(BookTitle);
		
	}

}
