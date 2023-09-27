package assignment2;

import java.time.LocalDate;

public class Test {
public static void main(String[] args) {
		
		reserve r = new reserve(LocalDate.parse("2018-11-01"));
		
		r.setResDate(LocalDate.parse("2018-10-01"));
		
		System.out.println(r.getResDate());
		
	}

}