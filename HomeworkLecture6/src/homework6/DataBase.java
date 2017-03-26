package homework6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DataBase {
	List<AbstractUser> database;

	public DataBase() {
		this.database = new ArrayList<AbstractUser>();
	}
			

	

	public void getUsers() {
		System.out.println(database);

	}
}
