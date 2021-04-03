package HomeWork.Rejisser;

import java.time.LocalDate;

public class Film {
	LocalDate release;  // дата выпуска
	String title;       // название фильма
	String[] countries; // страны
	
	public Film(LocalDate release, String title, String[] countries) {
		this.release = release;
		this.title = title;
		this.countries = countries;
	}
}
