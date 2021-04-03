package HomeWork.Arrays2D;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
	
	public static final int SIZE = 8;
	
	
	public static void main(String[] args) {
		int[][] colors = new int[SIZE][SIZE];
		int input;
		
		Random random = new Random();
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				colors[i][j] = random.nextInt(256);
			}
		}
		
		printArray(colors);
		
		System.out.println("Введите угол поворота матрицы (90/180/270): ");
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			int round;
			
			String angle = scanner.nextLine();
			
			if (isInt(angle)) {
				input = (Integer.parseInt(angle));
				
				if (!(input % 90 == 0)) {
					System.out.println("Вы ввели неверное число!");
					continue;
				}
				
				round = input / 90;
				colors = roundRotate(colors, round);
				printArray(colors);
				break;
			}
		}
	}
	
	public static boolean isInt(String x) throws NumberFormatException {
		try {
			Integer.parseInt(x);
			return true;
		} catch (Exception e) {
			System.out.println("Вы ввели не чило!");
			return false;
		}
	}
	
	public static int[][] roundRotate(int[][] colors, int round) {
		for (int i = 0; i < round; i++) {
			colors = rotate(colors);
		}
		return colors;
	}
	
	private static int[][] rotate(int[][] rotateArray) {
		int[][] rotateColors = new int[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				rotateColors[i][j] = rotateArray[SIZE - j - 1][i];
			}
		}
		return rotateColors;
	}
	
	public static void printArray(int[][] printColors) {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				System.out.format("%4d", printColors[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}