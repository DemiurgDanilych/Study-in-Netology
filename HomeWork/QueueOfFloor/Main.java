package HomeWork.QueueOfFloor;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	private static final int WAITDOORSINSECOND = 10;
	private static final int WAITMOVEINSECOND = 5;
	private static final int BREAKER = 999_999;
	
	public static void main(String[] args) {
		int totalSeconds = 0;
		int previousFloor = -1;
		ArrayDeque<Integer> queueFloors = new ArrayDeque<>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Введите номер этажа. Для выхода введите 0");
			String scanner = sc.nextLine();
			int floor = ifTheWord(scanner);
			if (goingAbove(floor)) {
				continue;
			}
			if (floor == 0) {
				break;
			}
			queueFloors.add(floor);
		}
		System.out.print("\nЛифт проследовал по следующим этажам :");
		System.out.println(queueFloors.toString());
		totalSeconds+= queueFloors.size() * WAITDOORSINSECOND;
		
		for (int currentFloor: queueFloors) {
			if (previousFloor == -1) {
				previousFloor = currentFloor;
				continue;
			}
			totalSeconds +=(Math.abs(currentFloor - previousFloor)) * WAITMOVEINSECOND;
			previousFloor = currentFloor;
		}
		System.out.println("Лифт затратил на маршрут : " + totalSeconds + "c.\n");
	}
	
	private static int ifTheWord(String message) throws NumberFormatException {
		try {
			return Integer.parseInt(message);
		} catch (NumberFormatException ex) {
			return BREAKER;
		}
	}
	
	private static boolean goingAbove(int number) {
		if (!(number >= 0 && number <= 25)) {
			System.out.println("\nВы ввели неверное число\n");
			return true;
		} else {
			return false;
		}
	}
}