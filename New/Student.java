package homeworkLecture5;

public class Student extends Person {
	
		public double score ;
		

	Student(String name, int age, boolean isMan, double score) {
		super(name, age, isMan);
		this.score = score;
	}
		
		//@Override
	//void showPersonInfo() {
		// TODO Auto-generated method stub
		//super.showPersonInfo();
		//System.out.println(name + " Score is " +  score);
	//}
		void showStudentInfo(){
			super.showPersonInfo();
			System.out.println(name + " Score is " +  score);
		}
		
		

		}
	
		


