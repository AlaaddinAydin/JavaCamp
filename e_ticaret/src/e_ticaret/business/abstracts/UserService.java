package e_ticaret.business.abstracts;

import e_ticaret.core.GoogleUserManagerAdapter;
import e_ticaret.core.OtherServices;
import e_ticaret.entities.concretes.User;

public interface UserService {
	void add(User user);
	
	void login(User user , OtherServices otherServices);
	
	void login(User user);
}
