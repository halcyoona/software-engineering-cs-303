package question1;


public class Driver {
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();
		st1.addAssignmentScore(9.5);
		st1.addAssignmentScore(8.5);
		st1.addExamScore(80);
		
		Student st2 = new Student();
		st2.addAssignmentScore(10);
		st2.addAssignmentScore(5);
		st2.addExamScore(70);
		
		Collection rostr = new Roster("Programming", "CS101");
		rostr.addStudent(st1);
		rostr.addStudent(st2);
		rostr.algorithmSelection();
		rostr.calculateClassAverage();
		AvgDispenser itr = rostr.createIterator(rostr);
		while(itr.hasMore()) {
			itr.getNext();
		}
	}

}
