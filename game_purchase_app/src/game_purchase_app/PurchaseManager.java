package game_purchase_app;

public class PurchaseManager implements PurchaseService{

	@Override
	public void purchase(Gamer gamer , Purches purches) {
		// TODO Auto-generated method stub
		System.out.println(purches.gameName + " Oyununun satışı başarılı bir şekilde gerçekleşti");
		System.out.println("İyi oyunlar " + gamer.firstName);
	}

	@Override
	public void purchaseWithDiscount(Gamer gamer, Purches purches, Discount discount) {
		// TODO Auto-generated method stub
		System.out.println(purches.gameName + " Oyununun satışı başarılı bir şekilde gerçekleşti");
		System.out.println("İyi oyunlar " + gamer.firstName);
		System.out.println("Aldınığınz oyun "+ discount.discountName +" kapsamında alınıp yüzde " + discount.discountValue +" indirim uygulanmıştır");
	}

}
