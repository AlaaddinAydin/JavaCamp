package e_ticaret.dataAcess.abstracts;

import e_ticaret.entities.concretes.User;

public interface UserDao {
	void register(User user);
	
	void login(User user);
}
