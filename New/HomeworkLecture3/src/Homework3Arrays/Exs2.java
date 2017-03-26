package Homework3Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exs2 {
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int newArraySize =0;
		
		
		System.out.println("Enter values fold of  2");
		
		
		for(int i =0 ;i <1; ++i){
			
			newArraySize = sc.nextInt();
			
			boolean isValueCorrect ;
			
			if (newArraySize %2 ==0){
				isValueCorrect = true;
			}
			else {
				isValueCorrect = false;
			}
			
			if (isValueCorrect == false){
				System.out.println("Enter correct Value" );
				--i;
				}
			}
			int array[] = new int[newArraySize];
			System.out.println("Enter value for first colm :" );
			for(int j = 0; j < array.length/2; ++j){
				array[j] =sc.nextInt();
				int halfLenght = array.length/2;
				System.arraycopy(array, j, array, halfLenght,array.length/2);
				
			}
			
			System.out.println(Arrays.toString(array));
			
				
		
	}
	}


