package HomeWork.ValidationOfReadEvents;

public class Main {
	
	public static void main(String[] args) {
		for (Event event: getMovies()) {
			validEvent(event);
		}
		for (Event event: getTheatres()) {
			validEvent(event);
		}
		System.out.println("Все события корректны");
	}
	
	public static Movie[] getMovies() {
		return new Movie[]{
				
				// Разкомитить для проверки
				//new Movie("null", 0, 0),
				
           		new Movie("Волк с Уолл-стрит", 2013, 18),
				new Movie("Шерлок Холмс", 2009, 12)
        };
	}
	
	public static Theatre[] getTheatres() {
		return new Theatre[]{
				new Theatre("Анна Каренина", 2017, 16),
				new Theatre("Ревизор", 2019, 4),
				new Theatre("Семейка Краузе", 2020, 18)
        };
	}
	
	public static void validEvent(Event event) {
		if ((event.getTitle().equals(null)) || event.getReleaseYear() == 0 || event.getAge() == 0)
		throw new RuntimeException();
	}

}
