package HomeworkLecture2;

import java.util.Scanner;

public class Exs8 {
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter n :");
			
				int n = sc.nextInt();
				int row =0;
				int cell = 0;
				 row = n -1;
				 int line = 0;
				 
				 
				while(line < n){
				 
				 for (cell = 0 ; cell<n ; ++cell){
					 System.out.print(row+ " ");
				 }
				 System.out.println();
				 row = row+2;
				 ++line;
				 }
				
				
		}
}
