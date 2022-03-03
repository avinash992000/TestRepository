package day6;

public class School {
	static final String name = "SRM University";
	
	class Student1{
		
		public void Access() {
			School s1 = new School();
			System.out.println("Student1 from "+s1.name);
		}
	}
	
	class Student2{
		
		public void Access() {
			School s1 = new School();
			System.out.println("Student2 from "+s1.name);
		}
	}
	class Student3{
	
		public void Access() {
			School s1 = new School();
			System.out.println("Student3 from "+s1.name);
	}
}

}
