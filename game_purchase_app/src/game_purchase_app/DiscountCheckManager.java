package game_purchase_app;

public class DiscountCheckManager implements DiscountCheckService{

	@Override
	public boolean checkIfRealDicount(Discount discount) {
		// TODO Auto-generated method stub
		if(discount.discountName == "sale" && discount.discountValue == 10) {
			return true;
		}else {
			return false;
		}
	}

}
