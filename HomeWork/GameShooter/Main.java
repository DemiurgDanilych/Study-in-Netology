package HomeWork.GameShooter;

import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player player = new Player();
		System.out.format("У игрока %d слотов с оружием,"
						+ " введите номер, чтобы выстрелить,"
						+ " -1 чтобы выйти%n",
				player.getSlotsCount()
		);
		
		while (true) {
			int slot = scanner.nextInt();
			if (-1 == slot)
				break;
			player.shotWithWeapon(slot);
			
		}
			System.out.println("Game over!");
		}
	}