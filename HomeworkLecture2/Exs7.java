import java.util.Scanner;

public class Exs7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Values
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int a = 1;
        // Print only fold of "3" integers
        while (a < n){
        	a = a+1;
        	if ( a%3 !=0){
        		continue;
        	}
        	System.out.println(a + ",");
        }

        
        	
        	
        	
       
      
        }
        
    }