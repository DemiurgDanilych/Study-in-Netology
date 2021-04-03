package HomeWork.Phonebook;

import java.util.Objects;

public class Contact implements Comparable<Contact> {
	
	private String name;
	private String number;
	
	public Contact(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	public Contact() {
	}
	
	public Contact createContact(String input) throws IndexOutOfBoundsException, NullPointerException {
			String[] contactPieces = input.split("\\+");
			return new Contact(contactPieces[0], contactPieces[1]);

	}
	
	@Override
	public String toString() {
		return "	Имя: " + name + ", " + " телефон +" + number;
	}
	
	@Override
	public int compareTo(Contact o) {
		return name.compareTo(o.name);
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Contact contact = (Contact) o;
		return Objects.equals(name, contact.name) && Objects.equals(number, contact.number);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, number);
	}
}