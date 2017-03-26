package Homework3Arrays;

import java.util.Arrays;

public class Exs5 {
	public static void main(String[] args) {
			
		double array[]= new double[10];
			array[0]= 0.5; 
			array[1]=5.6;
			array[2]=2.3;
			array[3]=5.8;
			array[4]= 9.8;
			array[5]= 8.4;
			array[6]=9.1;
			array[7]=23.5;
			array[8]=56.8;
			array[9]=25.6;
					
			
			for(int i =0; i<array.length;++i){
				
				array[i]= array[i]*array.length;
			}
					
					
			System.out.println(Arrays.toString(array));
		
		
	}
}
