package classPractice;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��Ͻÿ� : ");
		String name = scanner.nextLine();
		
		System.out.println("���� ������ �Է� �Ͻÿ� :" );
		int kor = scanner.nextInt();
		
		System.out.println("���� ������ �Է� �Ͻÿ� : ");
		int math = scanner.nextInt();
		
		int sum = kor + math;
		double avg = (double)sum / 2;
		
		System.out.println("�̸�:" + name + "\n" + "����:" + sum + "\n" + "���:" + avg);
		
	}

}