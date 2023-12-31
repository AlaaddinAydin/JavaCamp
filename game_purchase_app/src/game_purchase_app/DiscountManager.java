package game_purchase_app;

public class DiscountManager implements DiscountGrudService{
	
	DiscountCheckService discountCheckService;
	
	public DiscountManager(DiscountCheckService discountCheckService) {
		// TODO Auto-generated constructor stub
		this.discountCheckService = discountCheckService;
	}

	@Override
	public void add(Discount discount) {
		// TODO Auto-generated method stub
		if(discountCheckService.checkIfRealDicount(discount)) {
			System.out.println("İndirim başarılı bir şekilde eklendi");
		}else
		{
			System.out.println("mal mal konuşma");
		}
	}

	@Override
	public void delete(Discount discount) {
		// TODO Auto-generated method stub
		if(discountCheckService.checkIfRealDicount(discount)) {
			System.out.println("İndirim başarılı bir şekilde silindi");
		}else
		{
			System.out.println("mal mal konuşma");
		}
	}

	@Override
	public void update(Discount discount) {
		// TODO Auto-generated method stub
		if(discountCheckService.checkIfRealDicount(discount)) {
			System.out.println("İndirim başarılı bir şekilde güncellendi");
		}else
		{
			System.out.println("mal mal konuşma");
		}
	}
	
}
