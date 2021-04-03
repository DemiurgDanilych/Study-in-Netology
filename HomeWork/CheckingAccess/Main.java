package HomeWork.CheckingAccess;

import HomeWork.CheckingAccess.ExceptionOfAcces.UserNotFoundException;
import HomeWork.CheckingAccess.ExceptionOfAcces.AccessDeniedException;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws UserNotFoundException,AccessDeniedException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите логин");
		String login = scanner.nextLine();
		
		System.out.println("Введите пароль");
		String password = scanner.nextLine();
		
		User user = getUserByLoginAndPassword(login, password);
		validateUser(user);
	}
	

	
	public static User[] getUsers() {
		User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);
		User user2 = new User("Bob", "Bob@gmail.com", "qwerty", 10);
		User user3 = new User("Marli", "Marli@gmail.com", "1234", 18);
		
		return new User[]{user1,user2,user3};
	}
	
	public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
		User[] users = getUsers();
		for (User user : users) {
			if (user.getLogin().equals(login) && user.getPassw().equals(password)){
				return user;
			}
		}
		throw new UserNotFoundException(login,password);
	}
	
	public static void validateUser(User user) throws AccessDeniedException {
		if (user.getAge() < 18) {
			throw new AccessDeniedException(user.getLogin(), user.getAge());
		} else {
			System.out.println("Доступ разрешен.");
		}
	}
}
