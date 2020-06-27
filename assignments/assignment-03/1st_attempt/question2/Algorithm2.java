package question2;


public class Algorithm2 implements AlgorithmCollection {

	@Override
	public double calculateAverage(Student st) {
		double score = st.exam * 0.6;
		double assignScore = 0;
		for(int i = 0; i < st.pointerToAssignment; i++) {
			if (assignScore < st.assignment[i]) {
				assignScore = st.assignment[i];
			}
		}
		
		score += assignScore * 4;
		return score;
	}

}
