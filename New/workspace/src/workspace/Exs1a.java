package workspace;

import java.util.Scanner;

public class Exs1a {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// valueA
		System.out.println("Enter value A");
		int valueA = sc.nextInt();
		System.out.println("A is: " + valueA);
		
		//valueB
		System.out.println("Enter value B");
		int valueB = sc.nextInt();
		System.out.println("B is:" + valueB);
		
		//valueC
		System.out.println("Enter value C");
		int valueC = sc.nextInt();
		System.out.println("C is:" + valueC);
		
		
		// Comparison
		if (valueC  < valueB && valueC > valueA){
			System.out.println("C is between A and B values");
		} else {
			System.out.println("Fuck of Bitch");
		}
			
	
		
		
		
		

	}

}
