package assignment2;

import java.time.LocalDate;

public class reserve {
	private LocalDate prevResdate;
	private LocalDate resDate;

	public reserve(LocalDate ResDate) {
		this.prevResdate = ResDate;
		this.resDate = ResDate;
	}

	public LocalDate getResDate() {
		return resDate;
	}

	public void setResDate(LocalDate resDate) {
		if (prevResdate.compareTo(resDate) == 0)
			System.out.println("Date already reserved!");
		else
			this.resDate = resDate;
	}
}