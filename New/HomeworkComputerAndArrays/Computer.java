package HomeworkComputerAndArrays;

public class Computer {
	
	String operationSystem;
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	double freeMemory;
	
	
	
	
		void changeOperationSystem (String newOperationSystem){
			
			operationSystem = newOperationSystem;
			
				}
		
		void useMemory(double memory){
			
			freeMemory = freeMemory - memory;
											
			if(freeMemory < memory  ){
			
				System.out.println( "Not enogh memory");}
		}
			
			void allParameters(){
				
				
				
					
									
						
				System.out.println("Computer Parameters is : " +operationSystem + " ," + year + ","+ price + ","+"System is Notebook :"+ isNotebook +" ," + hardDiskMemory + ", " + freeMemory  );
				
				
				
					
				
				
			
		 }
		
	}

