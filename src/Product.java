abstract class Product {
	private String name;
	private double unitPrice;
	private int quantityInStock;
	private static double totalSales;
	
	abstract double applyDiscount();
	

	public Product() {	
		setName("");
		setUnitPrice(0);
		setQuantityInStock(0);
		setTotalSales(0);
	}

	public Product(String name, double unitPrice, int quantityInStock){
		setName(name);
		setUnitPrice(unitPrice);
		setQuantityInStock(quantityInStock);
		
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}

	public String getName() {
		return name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public double getTotalSales() {
		return totalSales;
	}

	public String toString() {
		return name + unitPrice + quantityInStock + totalSales;

	}

}
