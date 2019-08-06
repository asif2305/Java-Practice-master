
public class Book {
	private int Id;
	private String Title;
	private String Autor;
	private String Contributor;
	private int PublishedYear;
	private boolean Availablity;
	
	
	
	//constructor with all parameter to create a book
	public Book(int id, String title, String autor, String contributor,
			int publishedYear, boolean availablity) {
		Id = id;
		Title = title;
		Autor = autor;
		Contributor = contributor;
		PublishedYear = publishedYear;
		Availablity = availablity;
		System.out.println("Book Log:: "+  Title +" book is added in the library");
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public String getContributor() {
		return Contributor;
	}
	public void setContributor(String contributor) {
		Contributor = contributor;
	}
	public int getPublishedYear() {
		return PublishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		PublishedYear = publishedYear;
	}
	public boolean isAvailable() {
		return Availablity;
	}
	public void setAvailablity(boolean availablity) {
		Availablity = availablity;
	}
	
	
	

}
