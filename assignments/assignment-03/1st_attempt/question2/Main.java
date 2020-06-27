package question2;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();
		st1.addAssignmentScore(9.5);
		st1.addAssignmentScore(8.5);
		st1.addExamScore(80);
		
		Student st2 = new Student();
		st2.addAssignmentScore(7.5);
		st2.addAssignmentScore(8.5);
		st2.addExamScore(90);
		
		Roster rostr = new Roster("Programming Fundamental", "CS101");
		rostr.addStudent(st1);
		rostr.addStudent(st2);
		rostr.calculateClassAverage();
		rostr.showAverage();
	}

}
