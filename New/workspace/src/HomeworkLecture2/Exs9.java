package HomeworkLecture2;

import java.util.Scanner;

public class Exs9 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			
			
			
			// Enter A and B integer
			System.out.println("Enter integer A :");
			int a = sc.nextInt();
			
			System.out.println("Enter integer B :");
			int b = sc.nextInt();
			int c = 0;
			int i = 0;
			int d = 0;
			int f = 0;
			
			
			for( i = 0 ; i<b;++i){
				c = a *a;
				System.out.println(c);
				++a;
				d= c;
				f = d+c;
				System.out.println("+"+ f);
				
			}
			
			
			
				
			
		}
}
