package game_purchase_app;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		PurchaseManager purchaseManager = new PurchaseManager();
		DiscountManager discountManager = new DiscountManager(new DiscountCheckManager());
		
		
		discountManager.add(new Discount(1, "sale", 10));
		discountManager.delete(new Discount(1, "sale", 10));
		discountManager.update(new Discount(1, "sale", 10));
		
		
		
		gamerManager.add(new Gamer(1,"burak","demir","zarttirizorzro@gmail.com"));
		gamerManager.delete(new Gamer(1,"burak","demir","zarttirizorzro@gmail.com"));
		gamerManager.update(new Gamer(1,"burak","demir","zarttirizorzro@gmail.com"));
		
		
		purchaseManager.purchase(new Gamer(1,"burak","demir","zarttirizorzro@gmail.com"), new Purches(1, "Dishonored"));
		
		purchaseManager.purchaseWithDiscount(new Gamer(1,"burak","demir","zarttirizorzro@gmail.com"), new Purches(1, "Dishonored"), new Discount(1, "sale", 10));
	}

}
