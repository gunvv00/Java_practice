package fucxIb;

public class finddust {
	
	
	//미세먼지 동작 

		int findx;//미세먼지 값
		int result ;
		char grade;
		char findGrade;
	
		
	//A프로그램 입력
	void A() {	

		findGrade = computeGrade(findx);
		
		
	}
	//A프로그램 출력
	void print() {
		System.out.print(result);
		
	}
	
	//미세먼지 농도 값을 계산 A프로그램
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
