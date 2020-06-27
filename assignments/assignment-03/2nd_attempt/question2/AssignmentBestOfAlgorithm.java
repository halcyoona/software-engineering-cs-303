package question1;

public class AssignmentBestOfAlgorithm extends AlgorithmDecorator {

	AssignmentBestOfAlgorithm(AlgorithmCollection algo) {
		super(algo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calculateAverage(Student st) {
		double maxScore = 0;
		double totalScore = 0;
		for(int i = 0; i < st.pointerToAssignment; i++) {
			if (maxScore < st.assignment[i]) {
				maxScore = st.assignment[i];
			}
			totalScore += st.assignment[i];
		}
		totalScore = totalScore / st.pointerToAssignment;
		totalScore = totalScore * 4;	
		totalScore =  super.calculateAverage(st)-totalScore;
		totalScore = totalScore + (maxScore*4);
		return totalScore;
	}
}
