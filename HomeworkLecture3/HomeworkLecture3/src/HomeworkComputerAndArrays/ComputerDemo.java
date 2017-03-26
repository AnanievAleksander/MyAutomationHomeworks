package HomeworkComputerAndArrays;

import java.security.AllPermission;

public class ComputerDemo {

	public static void main(String[] args) {
		
		Computer fucking = new Computer();
		Computer alien = new Computer();
		
		
		//Computer1(fucking)
		
		fucking.year = 1996;
		fucking.price = 1000;
		fucking.isNotebook = false;
		fucking.hardDiskMemory = 20;
		fucking.freeMemory = 256;
		fucking.operationSystem = "Windows95";
		
		//Computer2(alien)
		
		alien.year = 2010;
		alien.price = 1000;
		alien.isNotebook = true;
		alien.hardDiskMemory = 500;
		alien.freeMemory = 4000;
		alien.operationSystem = "Windows7";
		
		// Use 100 of memory
		
		alien.useMemory(100);
		fucking.changeOperationSystem("Linux");
		 
		 alien.allParameters();
		 fucking.allParameters();
		 
		 
		
	
		
	}

}
