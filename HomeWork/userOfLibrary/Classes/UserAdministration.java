package HomeWork.userOfLibrary.Classes;

import HomeWork.userOfLibrary.Interfaces.Administration;
import HomeWork.userOfLibrary.Interfaces.Reader;
import HomeWork.userOfLibrary.User;

public class UserAdministration extends User implements Administration, Reader {
	
	public UserAdministration(String username) {
		super(username);
	}
	
	@Override
	public void overdueNotification(Reader reader) {
		System.out.println("Администратор " + getUsername() + " обнаружил просрочку возврата книги у пользоватетля "
				+ reader);
	}
	
	@Override
	public void takeBook(Administration administration) {
		System.out.println("Читатель " + getUsername() + " взял книгу у " + administration);
	}
	
	@Override
	public void returnBook(Administration administration) {
		System.out.println("Читатель " + getUsername() + " вернул книгу " + administration);
	}
}
