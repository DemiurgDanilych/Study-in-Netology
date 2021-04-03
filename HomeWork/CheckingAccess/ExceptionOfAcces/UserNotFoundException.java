package HomeWork.CheckingAccess.ExceptionOfAcces;

public class UserNotFoundException extends Exception {
	public UserNotFoundException(String user,String pass) {
		System.out.println("пользователя с логином \"" + user + "\" и паролем \"" + pass + "\" ненайден!");
	}
}