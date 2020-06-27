package question1;


public class AlgorithmDecorator implements AlgorithmCollection {
	
	private AlgorithmCollection wrappee;
	
	AlgorithmDecorator(AlgorithmCollection algo){
		wrappee = algo;
	}

	@Override
	public double calculateAverage(Student st) {
		
		return wrappee.calculateAverage(st);
	}
}
