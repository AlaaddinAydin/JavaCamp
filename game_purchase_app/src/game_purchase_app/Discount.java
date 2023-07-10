package game_purchase_app;

public class Discount {
	int id ;
	String discountName;
	int discountValue;
	
	public Discount(int id, String discountName, int discountValue) {
		this.id = id;
		this.discountName = discountName;
		this.discountValue = discountValue;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDiscountName() {
		return discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}
	public int getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(int discountValue) {
		this.discountValue = discountValue;
	}
}
