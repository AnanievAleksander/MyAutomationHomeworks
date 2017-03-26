package homework6;

import java.util.Date;

class UserImpl extends AbstractUser {
	
	private static boolean isAdmin =false;
	
	public UserImpl(String userName) {
		super(userName);
		this.isAdmin = false;
		
	}

	@Override
	public void userLogin() {
		this.isUserLogIn = true;

	}

	@Override
	public void userLogout() {
		this.isUserLogIn = false;

	}

	@Override
	public String userName() {
		this.userName = userName;
		return userName;
	}

	
	

	
	
}
