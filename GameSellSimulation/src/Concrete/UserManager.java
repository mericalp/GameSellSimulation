package Concrete;

import Abstract.User;
import Abstract.UserService;

public class UserManager implements UserService 	 {

	@Override
	public void signIn(User user) {
		System.out.println(user.getName()+" has signed in");
		
	}

	@Override
	public void deleteAccount(User user) {
		System.out.println(user.getName()+" account has been deleted.");
		
	}

	@Override
	public void updateAccount(User user) {
		System.out.println(user.getName()+" account has been updated.");
		
	}

}
