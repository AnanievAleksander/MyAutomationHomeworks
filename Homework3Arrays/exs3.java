package Homework3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class exs3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		
		System.out.println(" Enter field '0' of array :");
			int value = sc.nextInt();
			for(int i=0; i<2;++i){
				array[i]= value;
				
			}
			for (int j = 2; j<array.length;++j){
				if (j==2){
				array[j] = value ;}
				else{
					int n = 0;
				array[n]=array[j];
				
				
				
				}
				
				
				
				
				
				
				
			}
		
	System.out.println(Arrays.toString(array));
		
		
		
		
		
		
	
			
		}
	

	}


