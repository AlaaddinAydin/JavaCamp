package coffeShop;

public class NeroCustomerManager extends BaseCustomerManager {
	PersonCheckService personCheckService;
	
	public NeroCustomerManager(PersonCheckService personCheckService) {
		// TODO Auto-generated constructor stub
		this.personCheckService = personCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		if(personCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("geçerli kullanıcı giriniz");
		}
	}
	
	
	

}
