package HomeWork.userOfLibrary;

public  abstract class User {
	private String username;
	
	public User(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	@Override
	public String toString() {
		return getUsername();
	}
}
