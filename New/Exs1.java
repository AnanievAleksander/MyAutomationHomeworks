package exs1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exs1 {
	public static void main(String[] args) {

		List<Integer> array = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		
		// Enter max cells of Colection
		System.out.println("Enter a new Array Lenght");
		int maxCell = sc.nextInt();
		
		//Enter values
		for (int i = 0; i < maxCell; i++) {
			System.out.println("Enter a value:");

			array.add(sc.nextInt());

		}
		// remove !%3 values
		for (Iterator iterator = array.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if (integer % 3 != 0) {
				iterator.remove();
			}
			

		}
		Iterator<Integer>newIterator = array.iterator();
		if (newIterator.hasNext()){
			System.out.println(array);
		
		}
		

	}
}
	
	

