package practice;

import java.util.*;

public class middleTest7 {
	public static void main(String[] args) {

		Scanner al = new Scanner(System.in);
		System.out.println("알파벳을 입력 하시오(소문자) : ");
		int eng = al.next().charAt(0);

		middleTest7 t1 = new middleTest7();
		
		t1.printEng(eng);
	}

	// System.out.println(parseInt);
	void printEng(int eng) {

		for (int i = eng; i >= 97; i--) {
			for (int j = 97; j <= i; j++) {
				char t = (char)j;
				System.out.print(t + " ");
			}System.out.println();
		}
	}
}
