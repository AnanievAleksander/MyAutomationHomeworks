package exs2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Exs2 {

	public static void main(String[] args) {

		List<Integer> arrayFoldOfTwo = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		int arraySize = 0;
		int halfSize = 0;
		System.out.println("Enter Array Size Fold Of \"2 \"");
		
		
		//Enter value for Array size
		for (int i = 0; i < 1; i++) {
			arraySize = sc.nextInt();
			if (arraySize % 2 != 0) {
				--i;
				System.out.println("Enter Correct value For Array Size");
			} else {
				halfSize = arraySize / 2;
			}

		}
		// Enter a values for array
		for (int i = 0; i < halfSize; i++) {
			System.out.println(" Enter a Value");
			arrayFoldOfTwo.add(sc.nextInt());

		}
		// Copy and add first values
		arrayFoldOfTwo.addAll(arrayFoldOfTwo);

		System.out.println(" Print Array : "+ arrayFoldOfTwo);

	}
}
