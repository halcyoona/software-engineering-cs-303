package question1;



public class Algorithm1 implements AlgorithmCollection {
	
	
	@Override
	public double calculateAverage(Student st) {
		double score = st.exam * 0.6;
		double assignScore = 0;
		for(int i = 0; i < st.pointerToAssignment; i++) {
			assignScore += st.assignment[i];
		}
		assignScore = assignScore / st.pointerToAssignment;
		score += assignScore * 4;
		return score;
		
	}
}
