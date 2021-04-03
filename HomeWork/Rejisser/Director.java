package HomeWork.Rejisser;

import java.time.LocalDate;

public class Director {
	LocalDate birthday; // дата рождения
	String name;        // имя
	String surname;     // фамилия
	Film [] films;      // массив срежессированных фильмов
	
	public Director(LocalDate birthday, String name, String surname, Film[] films) {
		this.birthday = birthday;
		this.name = name;
		this.surname = surname;
		this.films = films;
	}
}
