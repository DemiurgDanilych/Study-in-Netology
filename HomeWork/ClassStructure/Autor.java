package HomeWork.ClassStructure;

public class Autor {
	
	private String name;
	private String surname;
	private int birthday;
	private String country;
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getBirthday() {
		return birthday;
	}
	
	public String getCountry() {
		return country;
	}
	
	public Autor(String name, String surname, int birthday, String country) {
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "\nАвтор: " +
				"\nИмя = " + name +
				"\nФамилия = " + surname +
				"\nДень рождения = " + birthday +
				"\nРодился в = " + country;
	}
	
}
