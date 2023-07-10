package coffeShop;

public abstract class BaseCustomerManager  implements CustomerService{

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("save to db " + customer.firstName);
	}

}
