package homework6;

import java.util.ArrayList;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class AdminUserImpl extends AbstractUser implements IAdminUser, IUser {

	private static boolean isAdmin;

	List<Object> database;

	public AdminUserImpl(String username) {
		super(username);
		this.isAdmin = true;
		this.database = new ArrayList<>();

			

		

			
	}

	@Override
	public void deleteUser(String username) {
		if (isAdmin = true) {
			username = "";

		}

	}

	@Override
	public void showAllUsersInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void userLogin() {
		super.userLogin();

	}

	@Override
	public void userLogout() {
		super.userLogout();

	}

	@Override
	public void createUser(String userName, boolean isAdmin) {
		UserImpl newUser = new UserImpl(userName);
		System.out.println(newUser.userName + " " + newUser.registrationDate + newUser.isUserLogIn);
		database.add(newUser);
		System.out.println(database.size());
	}

	
	

}
