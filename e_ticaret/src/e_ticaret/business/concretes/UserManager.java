package e_ticaret.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import e_ticaret.business.abstracts.UserService;
import e_ticaret.core.GoogleUserManagerAdapter;
import e_ticaret.core.OtherServices;
import e_ticaret.dataAcess.abstracts.UserDao;
import e_ticaret.entities.concretes.User;

public class UserManager implements UserService{
	

	UserDao userDao;
	GoogleUserManagerAdapter googleUserManagerAdapter;
	
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	public UserManager(UserDao userDao , GoogleUserManagerAdapter googleUserManagerAdapter) {
		super();
		this.userDao = userDao;
		this.googleUserManagerAdapter = googleUserManagerAdapter;
	}
	
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
		String regex = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if(user.getPass().length() >= 6 && user.getFirstName().length() > 2 && user.getLastName().length() > 2 && matcher.matches()) {
			userDao.register(user);
		}else {
			System.out.println("Geçerli bilgi giriniz");
		}
	}
	
	

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
		String regex = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if( matcher.matches() && user.getPass().length() >= 6  ) {
			System.out.println("Hoşgeldin " + user.getFirstName());
			
		}
		
	}

	@Override
	public void login(User user, OtherServices otherServices) {
		// TODO Auto-generated method stub
		String regex = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if( matcher.matches() && user.getPass().length() >= 6  ) {
			otherServices.logginInSystem("Google ile hoşgeldin");
			
		}
	}

	

}
