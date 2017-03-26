package homeworkLecture5;

 class Person {
	
		public String name;
		public int age;
		public boolean isMan;
	
			Person(String name,int age, boolean isMan){
			this.name =name;
			this.age=age;
			this.isMan=isMan;
	
			}
		void showPersonInfo (){
			if ( isMan == true){
				System.out.println( name + " is "+ age +" years old , he is a man");
			}else{
				System.out.println(name + " is "+ age + "years old, she is a woman");
			}
		}

}
