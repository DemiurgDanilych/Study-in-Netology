//package HomeWork.Array2;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//class Array2 {
//
//	public static void main(String[] args) {
//		Product[] allProducts = new Product[10];
//
//		Scanner scanner = new Scanner(System.in);
//		int counter = 0;
//		while (true) {
//			System.out.println("Введите название, цену и описание продукта через пробел:");
//			String input = scanner.nextLine();
//			if ("end".equals(input))
//				break;
//			String[] parts = input.split(" ");
//
//			String name = parts[0];
//			int price = Integer.parseInt(parts[1]);
//			String description = parts[2];
//			Product product = new Product(name, price, description);
//			allProducts[counter] = product;
//			counter++;
//		}
//		System.out.println(Arrays.toString(allProducts));
//		Product.quickSort(allProducts,0 ,allProducts.length -1);
//
//		/* Sort Test:
//		int[] x = {10,20,51,35,6,4,1,98,28,47,35};
//		Product.quickSort(x,0 ,x.length -1);
//		System.out.println(Arrays.toString(x));
//		 */
//	}
//}