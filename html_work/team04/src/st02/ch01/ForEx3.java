package st02.ch01;

import java.util.*;

public class ForEx3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�ʱⰪ�� �Է��Ͻÿ� : ");
		int sta = input.nextInt();
		System.out.print("������ �Է��Ͻÿ� : " );
		int end = input.nextInt();
		int sum = 0;
		
		for(int i = sta; i <= end; i++) {
			sum += i;
		}
		System.out.print(sta + "����" + end + "������ ���� : " + sum);

	}

}