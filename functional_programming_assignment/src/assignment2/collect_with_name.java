package assignment2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class collect_with_name 
{
	public static void main(String[] args) {
		Map<String, String> contacts = new HashMap<>();
		contacts.put("1237589020", "John");
		contacts.put("1237009020", "John");
		contacts.put("7890291111", "Neal");
		contacts.put("2647210290", "Raju");
		contacts.put("9999999999", "Peter");
		contacts.put("9081234567", "Neha");
		
		String targetName = "John";
		Map<String, String> johnContacts = contacts.entrySet().stream()
					.filter(entry -> entry.getValue().equals(targetName))
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		if(!johnContacts.isEmpty())
			System.out.println("Contacts with name john" + ": " + johnContacts);
		
		
		
	}
}
