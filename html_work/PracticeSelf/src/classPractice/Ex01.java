package classPractice;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scv = new Scanner(System.in);
		
		System.out.println("��ǰ���� �Է��Ͻÿ� : ");
		String name = scv.nextLine();
		
		System.out.println("������ �Է��Ͻÿ� : ");
		int price= scv.nextInt();
		
		System.out.println("������ �Է� �Ͻÿ� : ");
		int amount= scv.nextInt();
		
		int sum = price * amount;
		
		System.out.println(name+ "" + amount + "��"+ "" + sum + "����");
		

	}

}