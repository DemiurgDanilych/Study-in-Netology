package HomeWork.ClassStructure;

public class Book {
	
	private String bookName;
	private Autor autor;
	private int year;
	private int pages;
	
	public String getBookName() {
		return bookName;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getPages() {
		return pages;
	}
	
	public Book(String bookName, Autor autor, int year, int pages) {
		this.bookName = bookName;
		this.autor = autor;
		this.year = year;
		this.pages = pages;
	}
	
	@Override
	public String toString() {
		return "\nКнига:" +
				"\nНазвание книги = " + bookName + '\'' +
				",\nАвтор=" + autor.getName() + " " + autor.getSurname() + '\'' +
				",\nГод издания=" + year +
				",\nКол-во страниц=" + pages;
		
	}
	
	static void pageComparsion(int page1, int page2) {
		if (page1 > page2) {
			System.out.println("В первой книге больше страниц!");
		} else {
			System.out.println("\nВо второй книге больше страниц!");
		}
	}
}
