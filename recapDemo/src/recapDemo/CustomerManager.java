package recapDemo;

public class CustomerManager {
	private BaseLogger baseLogger;
	
	public CustomerManager(BaseLogger baseLogger) {
		// TODO Auto-generated constructor stub
		this.baseLogger = baseLogger;
	}
	
	public void add( ) {
		System.out.println("Müsteri eklendi");
		this.baseLogger.log("Loglandı");
	}
}
