package HomeWork.ClassStructure;

public class User {
	
	private String email;
	private String name;
	private String surname;
	private Book book;
	
	static int totalOnlin;
	
	
	public String getEmail() {
		return email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public Book getBook() {
		return book;
	}
	
	public User(String email, String name, String surname, Book book) {
		this.email = email;
		this.name = name;
		this.surname = surname;
		this.book = book;
		totalOnlin++;
	}
	
	@Override
	public String toString() {
		return "Пользователь:" +
				"\nemail = " + email +
				"\nИмя = " + name +
				"\nФамилия = " + surname +
				"\nКнига = " + book.getBookName() + '\'';
	}
	
	void userRead() {
		System.out.println("\n" + "Пользователь " + name + " " + surname + " читает книгу: \n" + book.getBookName());
	}
}


