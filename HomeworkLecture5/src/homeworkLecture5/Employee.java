package homeworkLecture5;

public class Employee extends Person {
		
		double	daySallary ;

		
	Employee(String name, int age, boolean isMan,double daySallary) {
		super(name, age, isMan);
		this.daySallary= daySallary;
		
			}
	
	
	//	@Override
	//void showPersonInfo() {
		// TODO Auto-generated method stub
	//	super.showPersonInfo();
	//	System.out.println( name + "  day sallary is  " + daySallary);
	//}
		void showEmployeeInfo(){
			super.showPersonInfo();
			System.out.println( name + "  day sallary is  " + daySallary);
		}

		double calculateOvertime(double hours){
			if (age<=18){
				return 0;
			}else{ daySallary = daySallary+(hours+(this.daySallary*1.5));
					return daySallary;
					
		}
			
		
			

		}
	

}
