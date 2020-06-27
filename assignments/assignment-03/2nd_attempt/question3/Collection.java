package question1;

public interface Collection {

	public AvgDispenser createIterator(Collection rostr);

	public void getStudentAverage(int position);

	public boolean checking(int position);

	public void addStudent(Student st);

	public void algorithmSelection();

	public void calculateClassAverage();
}
