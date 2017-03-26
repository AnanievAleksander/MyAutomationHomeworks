package Homework3Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.xml.transform.sax.TemplatesHandler;

public class Exs2 {
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int newArraySize =0;
		int halfLenght=0;
		int temp =0;
		
		
		System.out.println("Enter array size fold of  2");
		
		
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
				halfLenght = ((array.length)/2);
				//System.out.println(j);
				//System.out.println(halfLenght);
				 temp = halfLenght+j;
				 
				int value = sc.nextInt();
				System.out.println("Enter next value");
				array[j] = value;
				array[temp]= value;
			
				
				//System.arraycopy(array, j, array, halfLenght,halfLenght);
				
				
				
				//System.out.println(array[halfLenght]);
				//System.out.println(array[j]);
			
				
				
			
				
			}
			
		//	System.out.println(array.length);
		System.out.println(Arrays.toString(array));
			
				
		
	}
	}


