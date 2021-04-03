package HomeWork.userOfLibrary;

import HomeWork.userOfLibrary.Classes.UserAdministration;
import HomeWork.userOfLibrary.Classes.UserLibrarian;
import HomeWork.userOfLibrary.Classes.UserSupplier;

public class Main {
	
	public static void main(String[] args) {
		UserLibrarian tania = new UserLibrarian("Таня");
		UserSupplier bob = new UserSupplier("Bob");
		UserAdministration markiz = new UserAdministration("Маркиз");
		
		markiz.overdueNotification(bob);
		bob.returnBook(markiz);
		tania.reciveBook(bob);
		bob.bringBooks(tania);
	}
}