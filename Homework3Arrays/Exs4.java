package Homework3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exs4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int newArraySize;
		
		System.out.println("Enter array size :");
		newArraySize = sc.nextInt();
		int array[]= new int[newArraySize];
		//System.out.println(array.length);
		
		for(int i=0 ; i<array.length;++i){
			array[i]=sc.nextInt();
		}
	
		System.out.println(Arrays.toString(array));
	}
	
	

}
