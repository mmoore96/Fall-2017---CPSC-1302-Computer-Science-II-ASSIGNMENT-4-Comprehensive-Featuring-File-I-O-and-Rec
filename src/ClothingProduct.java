
public class ClothingProduct extends Product {
private String gender;
private double discountRate;

public ClothingProduct(){
    super();
    setGender("");
    setDiscountRate(.15);
}
public ClothingProduct(String name, double unitPrice, int quantityInStock,
		String gender, double discountRate ){
	super(name, unitPrice, quantityInStock);
	setGender(gender);
	setDiscountRate(discountRate);
}


public void setGender(String gender){
	this.gender = gender;
}
public void setDiscountRate(double discountRate){
	this.discountRate = discountRate;
}
public String getGender(){
	return gender;
}
public double getDiscountRate(){
	applyDiscount();
	return discountRate;
}
public double applyDiscount() {
	
	
	double cost = getUnitPrice();
	double dRate = getDiscountRate();
	
	
	double charge = cost - (cost * dRate);
	return charge;
	
}
	
}


