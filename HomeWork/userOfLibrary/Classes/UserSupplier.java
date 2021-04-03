package HomeWork.userOfLibrary.Classes;

import HomeWork.userOfLibrary.Interfaces.Administration;
import HomeWork.userOfLibrary.Interfaces.Librarian;
import HomeWork.userOfLibrary.Interfaces.Reader;
import HomeWork.userOfLibrary.Interfaces.Supplier;
import HomeWork.userOfLibrary.User;

public class UserSupplier extends User implements Reader, Supplier {
	public UserSupplier(String username) {
		super(username);
	}
	
	@Override
	public void takeBook(Administration administration) {
		System.out.println("Поставщик " + getUsername() + "взял почитать книгу у админа " + administration);
	}
	
	@Override
	public void returnBook(Administration administration) {
		System.out.println("Поставщик " + getUsername() + "вернул книгу админу " + administration);
	}
	
	@Override
	public void bringBooks(Librarian librarian) {
		System.out.println("Поставщик " + getUsername() + " привез книги библиотекарю " + librarian);
	}
}
