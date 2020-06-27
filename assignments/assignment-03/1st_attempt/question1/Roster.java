package question1;


public class Roster{
	String courseName;
	String courseCode;
	Student lst[] = new Student[10];
	int pointerToStudentArray =0;
	double finalClassAverage = 0;
	
	Roster(String name, String number){
		courseName=name;
		courseCode=number;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public void addStudent(Student st) {
		lst[pointerToStudentArray]=st;
		pointerToStudentArray += 1;
	}
	
	
	public void calculateClassAverage() {
		AlgorithmCollection algo = lst[0].getAlgorithm();
		algo = lst[0].changeAlgorithm();
		double marks;
		for(int i=0; i<pointerToStudentArray; i++) {
			marks = algo.calculateAverage(lst[i]);
			lst[i].finalScore = marks;
			finalClassAverage += marks;
		}
		finalClassAverage = finalClassAverage / pointerToStudentArray;
	}
	
	public void showAverage() {
		System.out.println("class Average : "+finalClassAverage);
	}
}
