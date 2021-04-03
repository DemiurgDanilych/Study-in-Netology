package HomeWork.Phonebook;

import java.util.*;

class PhoneBook {
	private final Map<String, List<Contact>> contacts = new HashMap<>();
	
	
	public boolean addGroup(String groupName) {
		if (groupName.equals(""))
			return false;
		if (contacts.containsKey(groupName)) {
			return false;
		} else {
			contacts.put(groupName, new ArrayList<>());
			return true;
		}
	}
	
	
	public boolean addContact(String input, Contact contact) {
		String[] groupDoll = input.split(" ");
		for (String groups : groupDoll) {
			if (!(contacts.containsKey(groups)))
				return false;
			List<Contact> group = contacts.get(groups);
			if (group.contains(contact))
				return false;
			group.add(contact);
			Collections.sort(group);
		}
		return true;
	}
	
	public void printAll() {
		System.out.println("Ваши Контакты:");
		for (Map.Entry<String, List<Contact>> map : contacts.entrySet()) {
			if (map.getValue().isEmpty())
				continue;
			System.out.println(" - " + map.getKey());
			for (Contact phoneContact : map.getValue()) {
				if (phoneContact == null)
					continue;
				System.out.println(phoneContact.toString());
			}
		}
	}
	
	public void printGroup() {
		for (Map.Entry<String, List<Contact>> mapKey : contacts.entrySet()) {
			System.out.println("- " + mapKey.getKey());
		}
	}
}