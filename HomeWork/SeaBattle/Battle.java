package HomeWork.SeaBattle;

import java.util.Random;
import java.util.Scanner;

public class Battle {
	
	public static final int SIZE = 10;
	public static final int EMPTY = 0;
	public static final int SHIP = 1;
	public static final int DEAD = 2;
	public static final int MISS = 3;
	public static final int MAX_COUNT_SHIP = 10;
	
	public static void main(String[] args) {
		
		int motion = 30;
		int countShip = MAX_COUNT_SHIP;
		int[][] warField = new int[SIZE][SIZE];
		
		Random random = new Random();
		for (int i = 0; i < MAX_COUNT_SHIP; i++) {
			int shipPlace1 = random.nextInt(SIZE);
			int shipPlace2 = random.nextInt(SIZE);
			
			if (warField[shipPlace1][shipPlace2] == SHIP) {
				i--;
			}
			
			warField[shipPlace1][shipPlace2] = SHIP;
		}
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			PrintScreen(warField, motion, countShip);
			
			//TODO Сделать проверку координат на выход за пределы размерности матрицы
			
			String input = scanner.nextLine();
			
			if ("end".equals(input)) {
				System.out.println("Вы сдались!");
				break;
			}
			
			String[] parts = input.split(" ");
			
			int shipPlace = Integer.parseInt(parts[0]) - 1;
			int shipPlace2 = Integer.parseInt(parts[1]) - 1;
			
			switch (warField[shipPlace][shipPlace2]) {
				
				case EMPTY:
					warField[shipPlace][shipPlace2] = MISS;
					System.out.println("Вы промазали!");
					motion--;
					break;
				
				case SHIP:
					warField[shipPlace][shipPlace2] = DEAD;
					motion--;
					countShip--;
					System.out.println("Корабль застрелян!");
					break;
				
				case DEAD:
					System.out.println("Вы попали в мертвый корабль, попробуйте ещё раз!");
					motion--;
					break;
				
				case MISS:
					System.out.println("Вы уже сюда стреляли!");
					motion--;
					break;
			}
			
			if (motion == 0) {
				System.out.println("Вы проиграли, попробуйте ещё раз!");
				break;
			}
			
			if (countShip == 0) {
				System.out.println("Вы выйграли!");
				break;
			}
			
		}
	}
	
	
	public static void PrintScreen(int[][] warField, int motion, int countShip) {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				System.out.printf("%-3d", warField[i][j]);
			}
			System.out.println();
		}
		System.out.println("\nВведите координаты для атаки (Осталось ходов: " + motion + ")");
		System.out.println("Осталось Кораблей: " + countShip);
		System.out.println();
	}
}
