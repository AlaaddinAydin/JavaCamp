package e_ticaret.core;

import e_ticaret.business.abstracts.UserService;
import e_ticaret.entities.concretes.User;
import e_ticaret.google.GoogleUserManager;

public class GoogleUserManagerAdapter implements OtherServices{

	@Override
	public void logginInSystem(String message) {
		// TODO Auto-generated method stub
		GoogleUserManager googleUserManager = new GoogleUserManager();
		
		googleUserManager.login(message);
	}
}
