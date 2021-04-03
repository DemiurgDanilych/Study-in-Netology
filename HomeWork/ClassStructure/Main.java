package HomeWork.ClassStructure;

public class Main {
	
	public static void main(String[] args) {
		
		
		Autor levTolstoy = new Autor("Лев", "Толстой", 1828, "Российская империя");
		Autor gerbertShild = new Autor("Герберт", "Шилдт", 1951, "США");
		Autor aleksandrRudazov = new Autor("Александр", "Рудазов", 1981, "СССР");
		Autor robertHazen = new Autor("Роберт", "Хейзен", 1948, "США");
		
		Book warAndPeace = new Book("Война и Мир", levTolstoy, 1869, 1274);
		Book javaCompleteGuide = new Book("Java. Полное руководство", gerbertShild, 2012, 1104);
		Book archmage = new Book("Архимаг", aleksandrRudazov, 2004, 460);
		Book historiOfTheEarth = new Book("История Земли", robertHazen, 2015, 390);
		
		User Bob = new User("@Bob", "Bob", "Sun", warAndPeace);
		User Doc = new User("@Doc", "Doc", "Fun", javaCompleteGuide);
		User Stasy = new User("@Stasy", "Stasy", "Sayonara", archmage);
		User Danila = new User("@Danila", "Oumygodepul", "", historiOfTheEarth);
		
		System.out.println(levTolstoy);
		System.out.println(Bob);
		System.out.println(warAndPeace);
		
		Doc.userRead();
		
		System.out.println("\nСравним кол-во страниц в книге "+ warAndPeace.getBookName() + " и "
				+ javaCompleteGuide.getBookName());
		Book.pageComparsion(warAndPeace.getPages(),javaCompleteGuide.getPages());
		
		System.out.println("\nКоличество пользователей онлайн : " + User.totalOnlin);
	}
}
