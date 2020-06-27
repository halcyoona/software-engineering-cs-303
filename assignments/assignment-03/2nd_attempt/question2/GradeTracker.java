package question1;

public class GradeTracker implements Listener {

	String grade = "None";
	@Override
	public void update(double marks) {
		// TODO Auto-generated method stub
		if (marks > 90) {
			grade = "A";
		}
		else if (marks > 80) {
			grade = "B";
		}
		else if (marks > 70) {
			grade = "C";
		}
		else if (marks > 60) {
			grade = "D";
		}
		else {
			grade="F";
		}
	}
	
	public void printGrade() {
		System.out.println(" grade is : "+grade);
	}

}
