package question1;

public class AvgIterator implements AvgDispenser {
	
	private Collection rost;
	int position=0;
	
	AvgIterator(Collection ros){
		rost = ros;
	}
	
	@Override
	public void getNext() {
		rost.getStudentAverage(position);
		position++;
	}

	@Override
	public boolean hasMore() {	
		return rost.checking(position);
	}

}
