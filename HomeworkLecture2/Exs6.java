import java.util.Scanner;

public class Exs6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Enter a value
		System.out.println(" Enter a Value");
		int input = sc.nextInt();
		int a = 1;
		int sum = 0;
		
		while (a<= input){
			
			sum =sum+a ;
			++a;
		}
		System.out.println(" Result is :" +sum);
		
	}
}
