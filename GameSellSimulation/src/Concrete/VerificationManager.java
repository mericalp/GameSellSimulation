package Concrete;

import Abstract.User;
import Abstract.VerificationService;

public class VerificationManager implements VerificationService {

	@Override
	public boolean verifyThePerson(User user) {
		
		return true;
	}

}
