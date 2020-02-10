package classPractice;

public class CalcExe {

	public static void main(String[] args) {
		
		Calc cc = new Calc();
		cc.report(90, 80, 75);

	}

}

class Calc {
	int sum ;
	int avg ;
	
	void report(int a, int b, int c) {

		sum = a + b + c ;
		avg = sum/3;
		
		System.out.println("«’¿∫ : " + sum +" "+ "∆Ú±’¿∫ : " + avg);

	}

}

