package homework6;

import java.util.Date;

abstract class AbstractUser implements IUser {

	String userName;
	Date registrationDate;
	boolean isUserLogIn;

	public AbstractUser(String userName) {
		this.userName = userName;
		this.registrationDate = new Date();
		this.isUserLogIn = false;

	}

	@Override
	public void userLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userLogout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date userRegistrationDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String userName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
