package classPractice;
import java.util.*;

 class Student0 {

	String name;
	int korScore;
	int engScore;
	String korGrade;
	String engGrade;

	// �̸�, ����, ���� ���� ������ ����
	public void setStudent(String n, int k, int e) {
		name = n;
		korScore = k;
		engScore = e;
	}

	// ���� ����, ���� ������ ����ؼ� �����ϴ� �޼ҵ�
	void compute() {
		korGrade = computeGrade(korScore);
		engGrade = computeGrade(engScore);
	}

	// �̸� �������� �������� �������� ���������� ����ϴ� �޼ҵ�
	void print() {
		System.out.println("name : " + name);
		System.out.println("korScore : " + korScore + "(" + korGrade + ")");
		System.out.println("engScore : " + engScore + "(" + engGrade + ")");
	}

	String computeGrade(int score) {
		String grade = "F";
		if (score >= 95) {
			grade = "A+";
		} else if (score >= 90) {
			grade = "A";
		} else if (score >= 85) {
			grade = "B+";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 75) {
			grade = "C+";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 65) {
			grade = "D+";
		} else if (score >= 60) {
			grade = "D";
		}

		return grade;
	}
}

public class Student2 {
	public static void main(String[] args) {
		
		Student0 student = new Student0();
		student.setStudent("�۰ǿ�",95,82);
		student.compute();
		student.print();
	}
	

}