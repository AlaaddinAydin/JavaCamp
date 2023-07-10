package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger[] logers = {new SmsLogger(),new DatebaseLogger(), new FileLogger()};
		CustomerManager customerManager = new CustomerManager(logers);
		
		Customer engin = new Customer(1,"Engin","Başbuğ");
		
		
		customerManager.add(engin);
	}

}
