package exs4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exs4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> array = new ArrayList<Integer>();
		boolean isEqual = true;

		System.out.println("Enter a Array lenght :");
		int arrayLenght = sc.nextInt();

		for (int i = 0; i < arrayLenght; i++) {

			System.out.println("Enter a value for Array cell " + i + " : ");
			array.add(sc.nextInt());

		}
		for (int i = 0; i < arrayLenght; i++) {
			if (array.get(i) == array.get(arrayLenght - 1) && arrayLenght / 2 == 0) {
				
				isEqual = true;
				arrayLenght = arrayLenght - 1;
				System.out.println(arrayLenght);
			//} else {
			//	isEqual = false;
			}

		}
		//if (isEqual = true) {
			//System.out.println("Array Is Mirror");
		//} else {
			//System.out.println("Array Is Not Mirror");
		//}

		//System.out.println(array);
		//System.out.println(isEqual);

	}

}
