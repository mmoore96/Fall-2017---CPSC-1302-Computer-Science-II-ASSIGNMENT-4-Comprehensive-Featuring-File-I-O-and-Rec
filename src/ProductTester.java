import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ProductTester {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Product> products = new ArrayList<Product>();
		try {

			File furnitureProducts = new File("furniture_products.txt.rtf");
			Scanner scan = new Scanner(furnitureProducts);

			while (scan.hasNext()) {
				String nameFromFile = scan.nextLine();
				double unitPriceFromFile = Double.parseDouble(scan.nextLine());
				int quantityInStockFromFile = Integer.parseInt(scan.nextLine());
				boolean indoorsFromFile = Boolean.parseBoolean(scan.nextLine());
				double discountRateFromFile = Double.parseDouble(scan
						.nextLine());

				Product p1 = new FurnitureProduct(nameFromFile,
						unitPriceFromFile, quantityInStockFromFile,
						indoorsFromFile, discountRateFromFile);
				// Drop it in the list
				products.add(p1);
				// System.out.println(p1);
			}
		} catch (IOException e) {
			System.out.println("File with object info not found");
		}
		// ///////
		try {

			File clothingProducts = new File("clothing_products.txt.rtf");
			Scanner scan = new Scanner(clothingProducts);

			while (scan.hasNext()) {
				String nameFromFile = scan.nextLine();
				double unitPriceFromFile = Double.parseDouble(scan.nextLine());
				int quantityInStockFromFile = Integer.parseInt(scan.nextLine());
				String genderFromFile = scan.nextLine();
				double discountRateFromFile = Double.parseDouble(scan
						.nextLine());

				Product p2 = new ClothingProduct(nameFromFile,
						unitPriceFromFile, quantityInStockFromFile,
						genderFromFile, discountRateFromFile);
				// Drop it in the list
				products.add(p2);
				// System.out.println(p2);
			}
		} catch (IOException e) {
			System.out.println("File with object info not found");
		}
		// /////////

		double totalSalesFromFile;
		try {
			// Getting data off the file
			File totalSale = new File("totalSales.txt.rtf");
			Scanner scan = new Scanner(totalSale);

			totalSalesFromFile = Double.parseDouble(scan.nextLine());

		} catch (IOException e) {
			System.out.println("File with object info not found");
		}

		// //////

		int choice = 0;
		do {
			Scanner scan = new Scanner(System.in);
			System.out
					.println("(1) Buy a Clothing Product (2) Buy a Furniture Product"
							+ "(3) Restock Clothing Product"
							+ "(4) Restock Furniture Product" + " \n(0) Exit ");
			try {

				choice = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Sorry. Please enter an integer next time.");
			}
			int numOfItems;
			int productChoice = 1;
			switch (choice) {
			case 1:
				System.out.println("How many items?");
				numOfItems = Integer.parseInt(scan.nextLine());
				sell(products, productChoice, numOfItems);
			}

		} while (choice != 0);
		System.out.println("Thank you for using the Discount Product Store!");
		PrintWriter w1 = new PrintWriter("furniture_products.txt.rtf");
		PrintWriter w2 = new PrintWriter("clothing_products.txt.rtf");
		PrintWriter w3 = new PrintWriter("totalSales.txt.rtf");
		w1.close();
		w2.close();
		w3.close();

	}



	public static boolean sell(ArrayList<Product> products, int index, int x) {
		Scanner scan = new Scanner(System.in);
		System.out.println("(1) Clothing (2) Furniture");
		int choice = Integer.parseInt(scan.nextLine());
		System.out.println("How many items?");
		int quantity = Integer.parseInt(scan.nextLine());

		if (quantity > 2) {
			double price = products.get(1).getUnitPrice();
			double Dcost = ((FurnitureProduct) products.get(index))
					.applyDiscount();
			double Fcost = Dcost - (Dcost * 0.5);
			return true;

		} else {
			double Dcost = ((FurnitureProduct) products.get(index))
					.applyDiscount();
			return true;
		}
	}

	public static void restock(ArrayList<Product> products) {

	}

	public static int findCheaper(ArrayList<Product> products, double threshold) {
		return 0;

	}
}
