package homeworkLecture5;



public class Demo {

	public static void main(String[] args) {
		
			
			
			
			Person man = new Person("Man", 35, true);
			Person woman = new Person("Woman", 25, false);
			Person ivan = new Student("Ivan", 19, true, 5.5);
			Person maria = new Student("Maria",15,false,6.0);
			Person alex = new Employee("Aleksander", 33, true, 35.05);
			Employee desy = new Employee("Desyslava", 25, false, 40.65);
			
			Person[] persons = {man,woman,ivan,maria,alex,desy};
			
		//	for (int i = 0; i < persons.length; i++) {
				
		//		persons[i].showPersonInfo();
		//		}					
			for (int i = 0; i < persons.length; i++) {
					if (persons[i] !=null){
						if (persons[i] instanceof Employee){
						Employee employee = (Employee) persons[i];
						employee.calculateOvertime(2);
						System.out.println(persons[i].name + "   day sallary is: "+employee.daySallary);
						}
					
					}
					
				}
			
			}
}		
				
					
				
			
						
			
			 
		
	
			
						
					
						
					
				
				
			
			
			
		
		


