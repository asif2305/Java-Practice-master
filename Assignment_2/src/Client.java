import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Client {
	private int Id;
	private String Name;
	private ArrayList<Book> BookList;
	private ArrayList<HashMap> dueDateMaps;
	
	
	
//client constructor with all parameter	
	
	public Client(int id, String name) {
		Id = id;
		Name = name;
		BookList = new ArrayList<Book>();
		dueDateMaps= new ArrayList<HashMap>();
		System.out.println("Client Log:: "+ Name +" new client is created");
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
	public void setBookList(Book book) {
		this.BookList.add(book);
	}
	

	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	
	
	
}
