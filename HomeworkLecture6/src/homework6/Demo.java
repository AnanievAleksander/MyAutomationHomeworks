package homework6;

import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		
		
//		AbstractUser pesho = new UserImpl("Pesho");
//		
//		System.out.println(pesho.userName());
//		System.out.println(pesho.userRegistrationDate());
//		pesho.userLogin();
//		System.out.println(pesho.isUserLogIn);
		AdminUserImpl alex = new AdminUserImpl("Alex");
		alex.createUser("Pesho", false);
		alex.createUser( "Gosho", false);
		alex.createUser("Mitko", true);
		alex.createUser("Niki", false);
	
		
		
		
		
		

	}

}
