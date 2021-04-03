package HomeWork.Phonebook;

import java.util.Scanner;

public class Main {
	
	private static final PhoneBook phoneBook = new PhoneBook();
	private static Contact contact = new Contact();
	private static final Scanner sc = new Scanner(System.in);
	private static boolean BREAKER = true;
	
	
	public static void main(String[] args) {
		
		
		createGroup();
		while (BREAKER) {
			createContact();
			addAContactToGroups();
		}
		phoneBook.printAll();
		
	}
	
	private static void createGroup() {
		while (true) {
			System.out.println("\nСоздаём группу (для завершения ввести нет):");
			String inputGroup = sc.nextLine();
			
			
			if (inputGroup.equals("нет"))
				break;
			
			if (phoneBook.addGroup(inputGroup)) {
				System.out.println("Группа успешно создана!");
			} else {
				System.out.println("\nТакая группа уже существует или вы ввели пустую группу!");
				
			}
		}
	}
	
	private static void createContact() throws IndexOutOfBoundsException, NullPointerException {
		while (true) {
			System.out.println("\nСоздаём контакт:\nВведите имя контакта и его номер в формате\n"
					+ "Иванов Иван Иванович +7(911)111-11-11" + "\nИли введите \"выход\" для выхода из программы");
			String inputContact = sc.nextLine();
			
			if (inputContact.equals("выход")) {
				BREAKER = false;
				break;
			}
			
			try {
				contact = contact.createContact(inputContact);
			} catch (IndexOutOfBoundsException | NullPointerException e) {
				System.out.println("Вы ввели неверные данные контакта!");
				continue;
			}
			break;
		}
	}
	
	private static void addAContactToGroups() {
		while (true) {
			
			if (!BREAKER)
				break;
			
			System.out.println("Укажите группы в которые хотите добавить контакт (или введите \"нет\"):");
			phoneBook.printGroup();
			String groups = sc.nextLine();
			
			if (phoneBook.addContact(groups, contact)) {
				break;
			} else {
				System.out.println("Вы вели неверные группы или контакт уже есть в группе!");
			}
		}
	}
	
	private static void printing(PhoneBook book) {
	}
}