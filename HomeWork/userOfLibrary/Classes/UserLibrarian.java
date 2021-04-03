package HomeWork.userOfLibrary.Classes;

import HomeWork.userOfLibrary.Interfaces.Administration;
import HomeWork.userOfLibrary.Interfaces.Librarian;
import HomeWork.userOfLibrary.Interfaces.Reader;
import HomeWork.userOfLibrary.Interfaces.Supplier;
import HomeWork.userOfLibrary.User;

public class UserLibrarian extends User implements Librarian, Administration {
	
	public UserLibrarian(String username) {
		super(username);
	}
	
	@Override
	public void overdueNotification(Reader reader) {
		System.out.println("Администратор" + getUsername() + " обнаружил просрочку возврата книги у пользоватетля "
				+ reader);
	}
	
	@Override
	public void orderBooks(Supplier supplier) {
		System.out.println("Библиотекарь " + getUsername() + " заказал книги у поставщика "
				+ supplier);
	}
	
	@Override
	public void reciveBook(Supplier supplier) {
		System.out.println("Библиотекарь " + getUsername() + " получил книги у поставщика "
				+ supplier);
	}
}
