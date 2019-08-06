import java.util.ArrayList;


public class Contributor {
	private int Id;
	private String Name;
	private ArrayList<Book> BookList;
	
	
	
	
	public Contributor(int id, String name, ArrayList<Book> bookList) {
		Id = id;
		Name = name;
		BookList = bookList;
		System.out.println("Contributor Log:: "+ name+ " new client is created");
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	

}
