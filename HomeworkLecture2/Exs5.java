import java.util.Scanner;

public class Exs5 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		// Input Values
		System.out.println(" Enter value A");
		int A = sc.nextInt();
		System.out.println(" Enter value B");
		int B = sc.nextInt();
		
		// Display results
		System.out.println(" Print All Integers Between ValueA & ValueB ");
		while (A <=B){
			System.out.print(A+" ");
			++A;			
		}
	}
}
