
public class FurnitureProduct extends Product {
	private boolean indoors;
	private double discountRate;

	public FurnitureProduct(){
	    super();
	    setIndoors(true);
	    setDiscountRate(.15);
	}
	public FurnitureProduct(String name, double unitPrice, int quantityInStock,
		boolean indoors, double discountRate ){
		super(name, unitPrice, quantityInStock);
		setIndoors(indoors);
		setDiscountRate(discountRate);
	}
	public void setIndoors(boolean indoors){
		this.indoors = indoors;
	}
	public void setDiscountRate(double discountRate){
		this.discountRate = discountRate;
	}
	public boolean getIndoors(){
		return indoors;
	}
	public double getDiscountRate(){
		return discountRate;
	}
	public double applyDiscount() {
		
		double cost = getUnitPrice();
		double dRate = getDiscountRate();
		
	
		double charge = cost - (cost * dRate);
		return charge;

	}
}


