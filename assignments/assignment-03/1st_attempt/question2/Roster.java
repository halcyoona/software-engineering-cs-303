package question2;


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
		for(int i=0; i<pointerToStudentArray; i++) {
			lst[i].calculatingFinalScore();
			finalClassAverage += lst[i].finalScore;
		}
		finalClassAverage = finalClassAverage / pointerToStudentArray;
	}
	
	public void showAverage() {
		System.out.println("class Average : "+finalClassAverage);
	}
}
