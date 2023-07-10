package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndivisualCustomer engin = new IndivisualCustomer();
		engin.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "102938";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber = "1234";
		
		CustomerManager customerManager = new CustomerManager();
		
		
		Customer[] customers = {engin,hepsiBurada,sendikaCustomer};
		
		customerManager.addMultiple(customers);
		
		
		
	}

}
