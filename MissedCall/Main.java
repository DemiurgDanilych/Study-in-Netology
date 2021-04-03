package MissedCall;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		printMessage();
		Contacts contacts = new Contacts();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		while (true) {
			switch (sc){

			}

		}

	}

	private static void printMessage() {
		System.out.println("Меню:\n" +
				"1. Добавить контакт\n" +
				"2. Добавить пропущенный вызов\n" +
				"3. Вывести все пропущенные вызовы\n" +
				"4. Очистить пропущенные вызовы\n" +
				"5. Выход\n" +
				"Выберите пункт из меню (1-4):");
	}
}
