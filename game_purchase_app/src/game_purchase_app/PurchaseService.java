package game_purchase_app;

public interface PurchaseService {
	void purchase(Gamer gamer , Purches purches);
	
	void purchaseWithDiscount(Gamer gamer , Purches purches , Discount discount);
}
