package classPractice;

import java.util.*;
public class IfEx2 {

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �Է�");
		int a = sc.nextInt();
		System.out.println("�ι�° ���� �Է�");
		int b = sc.nextInt();
		System.out.println("����° ���� �Է�");
		int c = sc.nextInt();
		if(a > b) {
			if(a > c)
				System.out.println(a + "���� ���� ŭ");
			else
				System.out.println(c + "���� ���� ŭ");
			}
		else{
			if(b > c)
				System.out.println(b + "���� ���� ŭ");
			else
				System.out.println(c + "���� ���� ŭ");
		}
	}
}