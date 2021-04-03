package HomeWork.Notebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static final int BREAKER = 999_999;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> chekList = new ArrayList<>();
		
		exit:
		while (true) {
			menu();
			String sc = scanner.nextLine();
			int number = ifTheWord(sc);
			if (goingAbove(number)) {
				continue;
			}
			
			switch (number) {
				
				case 1:
					System.out.println("\nВведите задачу");
					chekList.add(scanner.nextLine());
					break;
				case 2:
					System.out.println("\nСписок задач:");
					Iterator<String> chekListIterator = chekList.iterator();
					while (chekListIterator.hasNext()) {
						String task = chekListIterator.next();
						System.out.println((chekList.indexOf(task) + 1) + ". " + task);
					}
					break;
				case 3:
					System.out.print("Введите номер удаляемой задачи:");
					String delNumb = scanner.nextLine();
					int num = ifTheWord(delNumb);
					
					if (num == BREAKER) {
						break;
					}
					removeChekList(chekList, num);
					break;
				case 0:
					scanner.close();
					break exit;
			}
		}
		System.out.println("Удачи!))");
	}
	
	private static void menu() {
		System.out.printf("%s \n %s \n %s \n %s \n %s \n",
				"Выберите действие:",
				"1. Добавить задачу",
				"2. Вывести список задач",
				"3. Удалить задачу",
				"0. Выход");
	}
	
	private static int ifTheWord(String message) throws NumberFormatException {
		try {
			int x = Integer.parseInt(message);
			return x;
		} catch (NumberFormatException ex) {
			System.out.println("Это не число");
			return BREAKER;
		}
	}
	
	private static boolean goingAbove(int number) {
		if (!(number >= 0 && number <= 3)) {
			System.out.println("\nВы ввели неверное число\n");
			return true;
		} else {
			return false;
		}
	}
	
	private static void removeChekList(List list, int num) throws IndexOutOfBoundsException {
		try {
			list.remove(num - 1);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Вы ввели неверное число!");
		}
	}
}