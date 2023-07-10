package coffeShop;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	PersonCheckService personCheckService;
	
	public StarbucksCustomerManager(PersonCheckService personCheckService) {
		// TODO Auto-generated constructor stub
		this.personCheckService = personCheckService;
	}
	
	
	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		if(personCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("geçerli kişi giriniz");
		}
		
	}
}
