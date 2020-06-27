package question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Roster implements Collection{
	String courseName;
	String courseCode;
	Student lst[] = new Student[10];
	int pointerToStudentArray =0;
	double finalClassAverage = 0;
	
	Roster(String name, String number){
		courseName=name;
		courseCode=number;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public void addStudent(Student st) {
		lst[pointerToStudentArray]=st;
		pointerToStudentArray += 1;
	}
	
	public void algorithmSelection() {
		int number = 1;
		
		System.out.print( "if you want to apply Assignment Best Of algorithm 1, press anyother for default: " );
		java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			number = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<pointerToStudentArray; i++)
		{
			lst[i].changeAlgorithm(number);
		}
	}
	
	public void calculateClassAverage() {
		for(int i=0; i<pointerToStudentArray; i++) {
			lst[i].calculatingFinalScore();
			finalClassAverage += lst[i].finalScore;
		}
		finalClassAverage = finalClassAverage / pointerToStudentArray;
	}
	
	public void studentGrades() {
		for(int i=0; i<pointerToStudentArray; i++)
		{
			System.out.print("student "+(i+1));
			lst[i].showGrade();
		}
	}
	
	public void showAverage() {
		System.out.println("class Average : "+finalClassAverage);
	}

	@Override
	public AvgDispenser createIterator(Collection rostr) {
		AvgDispenser itr = new AvgIterator(rostr);
		return itr;
	}

	@Override
	public void getStudentAverage(int position) {
		System.out.println("Student "+position+" : "+lst[position].finalScore);
	}

	@Override
	public boolean checking(int position) {
		if (position < pointerToStudentArray) {
			return true;
		}
		else {
			return false;
		}
	}
}