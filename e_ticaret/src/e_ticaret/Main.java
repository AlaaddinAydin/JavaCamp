package e_ticaret;

import e_ticaret.business.abstracts.UserService;
import e_ticaret.business.concretes.UserManager;
import e_ticaret.core.GoogleUserManagerAdapter;
import e_ticaret.dataAcess.concrete.AbcUserDao;
import e_ticaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = new UserManager(new AbcUserDao());
		
		User user = new User(1, "Ahmet", "Okur", "ahmetokur@yandex.com", "113748");
		
		userService.login(user);
		userService.login(user,new GoogleUserManagerAdapter());
	}

}
