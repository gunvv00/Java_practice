package practice;

public class ArrayEx9 {

	public static void main(String[] args) {
		int[] numArr = new int[10]; // ���� ���� ���� �迭
		int[] counter = new int[10]; // ��� ���Դ��� �� ������ �迭

		for (int num = 0; num < numArr.length; num++) {
			numArr[num] = (int) (Math.random() * 10);
			System.out.print(numArr[num] + " "); // ���� �� ����
		}
		System.out.println("");
		
		for(int cot = 0; cot < numArr.length; cot++ ) { //���� ���� ���� ī��Ʈ
			counter[numArr[cot]]++; 
		}
		
		for(int i = 0; i < counter.length; i ++ ) {
			
			System.out.println(i + "�� ���� : " + counter[i]); //�������� ���� ���
		}
	}

}