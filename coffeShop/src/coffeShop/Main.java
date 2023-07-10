package coffeShop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager(new MernisServiceAdapter());
		
		baseCustomerManager.save(new Customer(1,"mehmet","Demirog","15263748"));
		baseCustomerManager2.save(new Customer(2, "mehmet", "sait", "7162534"));
		
		
		
	}

}
