package Homework3Arrays;

import java.util.Arrays;

public class Exs1 {
	
	public static void main(String[] args) {
		
		int array[] = new int[5];
			array[0]=10;
			array[1]=66;
			array[2]=12;
			array[3]= -416;
			array[4]= 5;
		int i;
		int temp=0;
		
		
		
			
			for ( i = 0; i<array.length; ++i ){
				int array2[] = new int[5]; 
				boolean equal;
				array2[temp] = array[i];
				if (array[i]%3 !=0 ){
					equal =true;}
				else {equal =false;}
				
				if (equal==false){
					
					++temp;
								
				 
								
				
						
					}
					System.out.println(array[temp]);
				}
			
			
					
				}
																				
			}
				
			
/// ??????? ////
