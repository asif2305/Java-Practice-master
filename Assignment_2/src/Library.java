import java.util.ArrayList;


public class Library {
	private String Name;
	private ArrayList<Book> BookList;
	
	
	
	public Library(String name) {
		Name = name;
		BookList= new ArrayList<Book>();
		System.out.println("Library Log::  "+name +" is created");
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public ArrayList<Book> getBookList() {
		return BookList;
	}
	public void setBookList(ArrayList<Book> bookList) {
		BookList = bookList;
	}
	public void addaBook(Book book){
		BookList.add(book);
	}
	
	
	
	//checking availblity of the book in the library  
	public boolean isBookAvailble(Book book){
		if(searchByTitle(book.getTitle())!=null){
			if(book.isAvailable()){
				System.out.println("Library Log:: "+ book.getTitle()+ " book is available in the library");
				return true;
			}
			else{
				System.out.println("Library Log:: "+ book.getTitle()+ "book is not physically available");
				return false;
			}	
		}
		return false;	
	}
	

	// book checkout function checks all the conditions and 
	//if all the conditions is full filled then it let the client lend a book
	public int bookCheckout(Book book, Client client){
		if(isBookAvailble(book) && client.getBookList().size()<19){
			client.setBookList(book);
			System.out.println(" Library Log:: "+book.getTitle()+ " Book is booked for "+ client.getName());
			book.setAvailablity(false);
		}
		else
			System.out.println("Library Log:: we cant book your Book");
		return 1;
	}
	
	// only search by title
	public Book searchByTitle(String title){
		ArrayList<Book> allBooks = getBookList();
 
		for(Book b: allBooks){
			if(b.getTitle().trim().toLowerCase().equals(title.trim().toLowerCase())){
				if(b.isAvailable())
					System.out.println("Library Log::  Book Found");
			}
				
			return b;
		}
		System.out.println("Library Log::  No Book Found with this Title");
		return null;
	}
	
	// only search by author name
	public Book searchByAuthor(String author){
		ArrayList<Book> allBooks = new ArrayList<Book>();
		allBooks= getBookList();
		for(Book b: allBooks){
			if(b.getAutor().trim().toLowerCase().equals(author.toLowerCase().trim()))
			{
					System.out.println("Library Log::  Book Found");
			}
			return b;
		}
		System.out.println("Library Log::  No Book Found for this Author");
		return null;
	}
	
	// only search by year
	public Book searchByYear(int year){
		ArrayList<Book> allBooks = getBookList();
		for(Book b: allBooks){
			if(b.getPublishedYear()==year)
				System.out.println("Library Log::  Book Found");
			return b;
		}
		System.out.println("Library Log:: No Book Found for year "+ year);
		return null;
	}
	
	public Book searchByContributor(String contributor){
		ArrayList<Book> allBooks =getBookList();
		for(Book b: allBooks){
			if(b.getContributor().toString().trim().toLowerCase().equals(contributor.toString().toLowerCase().trim()))
				System.out.println("Library Log:: Book Found");
			return b;
		}
		System.out.println("Library Log:: No Book Found for this Contributor");
		return null;
	}
	
	
	public boolean removeBook(Book book){
		// have to impliment
		return false;
	}
}
