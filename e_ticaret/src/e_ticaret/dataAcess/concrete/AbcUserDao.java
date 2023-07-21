package e_ticaret.dataAcess.concrete;

import e_ticaret.dataAcess.abstracts.UserDao;
import e_ticaret.entities.concretes.User;

public class AbcUserDao implements UserDao{

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kullanıcı eklendi. Hoşgeldin "+ user.getFirstName() +"!");
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println("Hoşgeldin "+ user.getFirstName() +"!");
	}

}
