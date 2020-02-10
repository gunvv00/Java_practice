package fucxIb;

import java.util.Scanner;

public class finddustExe {

	public static void main(String[] args) {
		
		
		finddust finddust = new finddust();
		intputresult(finddust);
		printresult(finddust);
	}
	public static void intputresult(finddust finddust) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("³óµµ °ª : ");finddust.result= scanner.nextInt();
		
	}

	public static void printresult(finddust finddust) {
	System.out.println("-----------------------");
		System.out.print(" ¿À´ÃÀÇ ¹Ì¼¼¸ÕÁö : "+finddust.computeGrade(finddust.result)); 
		
	}

	

}
