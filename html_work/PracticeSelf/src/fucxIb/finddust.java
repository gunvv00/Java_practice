package fucxIb;

public class finddust {
	
	
	//�̼����� ���� 

		int findx;//�̼����� ��
		int result ;
		char grade;
		char findGrade;
	
		
	//A���α׷� �Է�
	void A() {	

		findGrade = computeGrade(findx);
		
		
	}
	//A���α׷� ���
	void print() {
		System.out.print(result);
		
	}
	
	//�̼����� �� ���� ��� A���α׷�
	char computeGrade(int result) {
		char grade = 'F';
		if(result >=90) {
			
			grade= 'A';
		}else if(result>= 80) {
			grade= 'B';
		}else if(result >= 70) {
			grade = 'C';
		}else if(result>= 60) {
			grade = 'D';
		}
		return grade;
	}

}