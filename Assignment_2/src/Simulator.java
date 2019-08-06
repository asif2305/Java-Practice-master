import java.util.ArrayList;


public class Simulator {
	
	
	public void startSimulation(){
		
		//creating an empty library
		Library library = new Library("TUC Library");
		
		
		//creating 3 books of same Author.
		Book book1 = new Book(1, "Artificial Inteligence", "Mobasser Ahmed", "Mobasser Ahmed", 2018, true);
		library.addaBook(book1);
		Book book2= new Book(2, "Machine Learning", "Mobasser Ahmed", "Mobasser Ahmed", 2019, true);
		library.addaBook(book2);
		Book book3= new Book(3, "Deep Learning", "Mobasser Ahmed", "Mobasser Ahmed", 2017, true);
		library.addaBook(book3);
		
		//
	    ArrayList<Book> booklist= new ArrayList<Book>();
	    booklist= library.getBookList();
	    System.out.println();
	    System.out.println("showing books information");
	    for(Book b: booklist){
	    	System.out.println(" Book Id: "+ b.getId());	
	    	System.out.println(" Book Name: " +b.getTitle());
	    	System.out.println(" Book Author: " +b.getAutor());
	    }
		
		
		
		
		//creating 2 new users
	    System.out.println();
		Client client1 = new Client(1, "Sunny");
		Client client2 = new Client(1, "prova");
		System.out.println();
		
		
		//first user is taking all the books
		System.out.println("client 1 is trying to take 3 books");
		library.bookCheckout(book1, client1);
		library.bookCheckout(book2, client1);
		library.bookCheckout(book3, client1);
		System.out.println();
		
		
		//second user is taking a book
		System.out.println("client 2 is trying to take 1 book");
		library.bookCheckout(book1, client2);
		
		
		
		
		
		
	}
	
	

}
