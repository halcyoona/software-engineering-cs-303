package question1;




import question1.DefaultAlgorithm;
import question1.AlgorithmCollection;


public class Student {
	
	double assignment[] = new double[10];
	int pointerToAssignment=0;
	double exam;
	double finalScore =0;
	AlgorithmCollection algo;

	public void addAssignmentScore(double marks) {
		// TODO Auto-generated method stub
		assignment[pointerToAssignment] = marks;
		pointerToAssignment += 1;
	}

	public void addExamScore(double exm) {
		// TODO Auto-generated method stub
		exam = exm;
	}
	
	

	
	public void changeAlgorithm(int number) {
		
	
		algo = new DefaultAlgorithm(); 
		
		if (number == 1){
			algo = new AssignmentBestOfAlgorithm(algo); 
		}
		
	}

	public void calculatingFinalScore() {
		finalScore = algo.calculateAverage(this);
	}

}
