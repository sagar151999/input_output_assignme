package assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class name_matched {
	public static void main(String[] args) {
		Map<String, String> contacts = new HashMap<>();
		contacts.put("1237589020", "John");
		contacts.put("1237009020", "John");
		contacts.put("7890291111", "Neal");
		contacts.put("2647210290", "Raju");
		contacts.put("9999999999", "Peter");
		contacts.put("9081234567", "Neha");
		
		String targetName = "John";
	List<String> johnContacts = new ArrayList<>();

		for (Map.Entry<String, String> entry : contacts.entrySet()) {
			if (entry.getValue().equals(targetName)) {
				johnContacts.add(entry.getKey());
			}
		}

		if (!johnContacts.isEmpty()) {
			System.out.println("Contacts of " + targetName + ": " + johnContacts);
		}	}
		
}
