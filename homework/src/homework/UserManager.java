package homework;

public class UserManager  {
	public void add() {
		System.out.println("Kullanıcı eklendi");
		
	}
	
	public void add(User[] users) {
		for (User user : users) {
			System.out.println("Kullanıcı eklendi " + user.getFirstName());
		}
		
	}
}
