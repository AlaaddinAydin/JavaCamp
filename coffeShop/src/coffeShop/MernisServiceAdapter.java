package coffeShop;

public class MernisServiceAdapter implements PersonCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		if(customer.firstName == "mehmet") {
			return true;
		}else {
			return false;
		}
	}
	
}
