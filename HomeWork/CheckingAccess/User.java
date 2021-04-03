package HomeWork.CheckingAccess;

public class User {
	private String login;
	private String passw;
	private String email;
	private int age;
	
	
	public User(String login,String email ,String passw , int age) {
		this.login = login;
		this.passw = passw;
		this.age = age;
		this.email = email;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getPassw() {
		return passw;
	}
	
	public int getAge() {
		return age;
	}
}
