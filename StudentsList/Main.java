package StudentsList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
	СТУДЕНТЫ ДЛЯ ТЕСТА:
		Иванов Петр Николаевич, 1243-Б, 31231343
		Петрова Татьяна Михайловна, 1243-Б, 43221343
 */

public class Main {

	private static final Set<Student> studentsList = new HashSet<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			message();
			String input = sc.nextLine();
			
			if (input.equals("end")) {
				break;
			}
			
			Student student = parsing(input);
			
			if (student == null) {
				System.out.println("Вы ввели неверное значение");
				continue;
			}
			
			if (studentsList.contains(student)) {
				System.out.println("Студент с таким номером студенческого билета уже существует!");
				continue;
			}
			studentsList.add(student);
		}
		print();
	}
	
	
	private static void message() {
		System.out.println("\nВведите информацию о студенте через запятую:\n" +
				"ФИО, номер группы, номер студенческого билета" +
				"\n(для завершения работы программы введите \"end\")\n");
	}
	
	private static void print() {
		System.out.println("Список студентов:");
		for (Student student : studentsList) {
			System.out.println(student.toString());
		}
	}
	
	private static Student parsing(String text) throws IndexOutOfBoundsException {
		try {
			String[] textPieces = text.split(",");
			return new Student(textPieces[0], textPieces[1], textPieces[2]);
		} catch (IndexOutOfBoundsException mes) {
			return null;
		}
	}
}