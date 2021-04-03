package HomeWork.Rejisser;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		Film film1 = new Film(LocalDate.parse("1998-10-10"), "Карты, деньги, два ствола", new String[]{"Великобритания"});
		Film film2 = new Film(LocalDate.parse("2008-01-02"), "Рок-н-рольщик", new String[]{"США", "Великобритания"});
		
		Director director = new Director(LocalDate.parse("1968-09-10"), "Гай", "Ричи", new Film[]{film1, film2});
		
		System.out.printf("Режиссер: %s %s, дата рождения: %s", director.name, director.surname, director.birthday);
		System.out.println("   Фильмы:");
		for (Film film : director.films) {
			System.out.printf("   %s %s%n", film.title, film.release);
			for (String county : film.countries) {
				System.out.printf("      %s%n", county);
			}
		}
	}
}


