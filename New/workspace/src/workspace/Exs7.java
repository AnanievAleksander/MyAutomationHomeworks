package workspace;

import java.util.Scanner;

public class Exs7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
									
		// Conditions
				
		System.out.println("Whats'the time ? Enter value from 1 to 24");
		int hour = sc.nextInt();
		
			
		System.out.println("How much money i have in my pocket?");
		double money = sc.nextDouble();
		
		System.out.println("Am i healthy ?");
		
		boolean iAmHealty = sc.nextBoolean();
		
		//Decisions
		
			
			// I am Sick
		if(iAmHealty == false){
		System.out.println("Fuck i stay at home");}
		
		if ( iAmHealty == false && money <5){
			System.out.println("I don't have enogh money ,just drink a hot tea :( ");
		} else {
			if (iAmHealty == false && money >= 5){
				System.out.println("But first must go to buy a medicine");
			}
		}
			
		
		// I am Healthy
		
		if( iAmHealty == true){
			System.out.println("Today i go out ");
		}
		if (iAmHealty == true && money > 5 && hour <=20){
			System.out.println("and take some cofee");
		}
			
		
		if(iAmHealty == true && money >= 50 && hour >= 21){
			System.out.println("And just cut my head :)");
		}else{ 
			if(iAmHealty == true && money <50 && hour >= 21){
				System.out.println("With my girl to wach some movie");
			}else{
				if (iAmHealty == true && money <=20 && hour <20){
					System.out.println("or drink some beers with friends");
				}
			}
		}
			
			
		
		
		
		
		
	}

}
