package assignment2;

import java.util.HashMap;
import java.util.Map;

public class find_avg_of_marks {

	public static void main(String[] args) {
		Map<String, String> contacts = new HashMap<>();
		contacts.put("1237589020", "John");
		contacts.put("1237009020", "John");
		contacts.put("7890291111", "Neal");
		contacts.put("2647210290", "Raju");
		contacts.put("9999999999", "Peter");
		contacts.put("9081234567", "Neha");
		

		Map<String,Double> marks = new HashMap<>();
		marks.put("Science", 66.00);
		marks.put("Maths", 78.00);
		marks.put("English", 90.00);


        double average = marks.values()
            .stream()
            .mapToDouble(Double::doubleValue)
            .average()
            .orElse(0.0);

        System.out.println("Average of all marks: " + average);
	}

}
