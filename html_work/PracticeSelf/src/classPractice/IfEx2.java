package classPractice;

import java.util.*;
public class IfEx2 {

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수 입력");
		int a = sc.nextInt();
		System.out.println("두번째 정수 입력");
		int b = sc.nextInt();
		System.out.println("세번째 정수 입력");
		int c = sc.nextInt();
		if(a > b) {
			if(a > c)
				System.out.println(a + "값이 제일 큼");
			else
				System.out.println(c + "값이 제일 큼");
			}
		else{
			if(b > c)
				System.out.println(b + "값이 제일 큼");
			else
				System.out.println(c + "값이 제일 큼");
		}
	}
}
