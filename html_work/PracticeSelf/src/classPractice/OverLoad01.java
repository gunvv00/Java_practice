package classPractice;

class OverLoad01 {
	public static void main(String[] args) {

		OverLoadExe ove = new OverLoadExe();

		ove.print(10.321);
		ove.print(10);
	}
}

class OverLoadExe {
	int print(int num) {
		System.out.println(num);
		return num;
	}

	double print(double num) {
		System.out.printf("sd", num);
		return num;
	}
}
