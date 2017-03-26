

// Exercises four and five ascending and descending chart // 

package workspace;

import java.util.Scanner;

public class Exs4 {

	public static void main(String[] args) {
		
		// Values //
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter value 1 :");
		int value1 = sc.nextInt();
		System.out.println("Enter value 2 :");
		int value2 = sc.nextInt();
		
		// Chart //
		System.out.println( "Values in ascending row :");
		
		if ( value1 <= value2){
			System.out.println( value1);
			System.out.println(value2);
		} else { 
			System.out.println( value2);
			System.out.println(value1);
		}
		
		System.out.println( "Values in descending row : ");
		
		if (value1 <= value2){
			System.out.println( value2);
			System.out.println( value1);
		} else {
			System.out.println( value1);
			System.out.println(value2);
		}
		
		
		
	}

}
