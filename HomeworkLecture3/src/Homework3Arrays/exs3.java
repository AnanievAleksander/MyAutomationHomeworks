package Homework3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class exs3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		
		System.out.println(" Enter field '0' of array :");
			int value = sc.nextInt();
			for (int i = 0; i < array.length; i++) {
				if ( i<2){
				array[i]=value;}
				
				
				
			}//System.out.println(Arrays.toString(array));
			for (int i = 0; i < array.length; i++) {
				if (i>=2){
				int q = array[i]+array[i-1];	
				
				array[i]=q;
				System.out.println(q);
			}
				
				
				}System.out.println(Arrays.toString(array));
				
				
				
				
				
				
				
			
		
	
		
		
		
		
		
		
	}
			
		}
	

	


