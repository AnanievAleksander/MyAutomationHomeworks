package HomeworkLecture2;

public class Exs3 {
	
			public static void main(String[] args) {
				
				int a = -10;
				++a;
			
			
		// Print only odd numbers
				
				do {			
					System.out.print( a+" " );
					++a;
					++a;
				}while (a <=10);
				
				
				
				
				for (int b = -10 ; b<10 ; b++ ){
					if ( b %2 !=0){
						continue; }
					System.out.println(b+1);
				
					
				
				}
			}

}
