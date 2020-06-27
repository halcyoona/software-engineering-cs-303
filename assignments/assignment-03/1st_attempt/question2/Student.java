package question2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Student implements IterableCollection{
	
	double assignment[] = new double[10];
	int pointerToAssignment=0;
	double exam;
	double finalScore;
	AlgorithmCollection algo = new Algorithm1();
	Listener lis = new GradeTracker();

	public void addAssignmentScore(double marks) {
		// TODO Auto-generated method stub
		assignment[pointerToAssignment] = marks;
		pointerToAssignment += 1;
	}

	public void addExamScore(double exm) {
		// TODO Auto-generated method stub
		exam = exm;
	}
	
	public void calculatingFinalScore() {
		finalScore = algo.calculateAverage(this);
		lis.update(finalScore);
	}
	
	@Override
	public AlgorithmCollection getAlgorithm() {
		algo = new Algorithm1();
		return algo;
	}
	
	public AlgorithmCollection changeAlgorithm() {
		
		int number = 1;
		
		System.out.print( "For Algorithm 1, press 1 and for Algorithm 2, press 2: " );
		java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			number = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (number == 1){
			System.out.println("Algorithm 1 selected");
			algo = new Algorithm1(); 
		}
		
		
		else if (number == 2){
			System.out.println("Algorithm 2 selected");
			algo = new Algorithm2(); 
		}
		
		else {
			System.out.println("you press somthing else by Default Algorithm 1 se selected");
		}
		return algo;
	}

}
