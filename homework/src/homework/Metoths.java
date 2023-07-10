package homework;

public class Metoths {
	public void add(UserManager userManager) {
		userManager.add();
	}
	
	public void add(UserManager[] userManagers) {
		for (UserManager userManager : userManagers) {
			userManager.add();
		}
		
	}
}
