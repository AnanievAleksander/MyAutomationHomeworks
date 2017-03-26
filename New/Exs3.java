package exs3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exs3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> array = new ArrayList<Integer>();

		System.out.println("Enter a Array lenght :");
		int arrayLenght = sc.nextInt();
		// Define previousValue
		int previousValue = 0;
		// Enter value
		System.out.println("Enter a value for first Array cell:");
		int value = sc.nextInt();
		array.add(value);

		// Summ next values in array range
		for (int i = 0; i < arrayLenght; i++) {

			value = array.get(i);
			array.add(value + previousValue);

			previousValue = array.get(i);

		}
		System.out.println(array);

	}

}
