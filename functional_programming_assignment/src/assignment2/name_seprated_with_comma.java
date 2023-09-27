package assignment2;

import java.util.HashMap;
import java.util.Map;

public class name_seprated_with_comma {

	public static void main(String[] args) {
		Map<String, String> contacts = new HashMap<>();
		contacts.put("1237589020", "John");
		contacts.put("1237009020", "John");
		contacts.put("7890291111", "Neal");
		contacts.put("2647210290", "Raju");
		contacts.put("9999999999", "Peter");
		contacts.put("9081234567", "Neha");
		
		StringBuilder s = new StringBuilder();

		for (String name : contacts.values()) {
			s.append(name).append(",");
		}

		if (s.length() > 0) {
			s.deleteCharAt(s.length() - 1);
		}
		
		String namesSeparatedByComma = s.toString();
        System.out.println(namesSeparatedByComma);
        
	}

}
