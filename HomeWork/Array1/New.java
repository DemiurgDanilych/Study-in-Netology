package HomeWork.Array1;

import java.util.Scanner;

class Array1 {
	
	public static void main(String[] args) {
		
		String[] products = new String[]{"1. Хлеб", "2. Молоко", "3. Соль", "4. Печенье", "5. Мясо"};
		int[] prices = new int[]{25, 65, 40, 38, 160};
		int[] productCount = new int[products.length];
		int[] sumProduct = new int[products.length];
		int sumAllProducts = 0;
		
		System.out.println("Список товаров:");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i] + " - " + prices[i] + " рублей.");
		}
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("\nВведите номер товара ,который хотите купить, и его количество через пробел: " +
					"\nНапример '1 3' или end для выхода.");
			String input = scanner.nextLine();
			if ("end".equals(input))
				break;
			
			String[] parts = input.split(" ");
			int productNumber = Integer.parseInt(parts[0]) - 1;
			productCount[productNumber] += Integer.parseInt(parts[1]);
			
			int currentPrice = prices[productNumber];
			sumProduct[productNumber] = currentPrice * productCount[productNumber];
		}
		
		for (int j : sumProduct) {
			sumAllProducts += j;
		}
		
		System.out.println("Наименование товара | Количество | Цена/за.ед | Общая  стоимость |");
		for (int i = 0; i < products.length; i++) {
			if (productCount[i] != 0)
				System.out.printf("%-19s | %10d | %10d | %15d  | \n", products[i], productCount[i], prices[i], sumProduct[i]);
		}
		System.out.printf("%52s %10d", "Итого:", sumAllProducts);
	}
}
