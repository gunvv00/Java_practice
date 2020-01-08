package practice;

public class ArrayEx9 {

	public static void main(String[] args) {
		int[] numArr = new int[10]; // 랜덤 수를 담을 배열
		int[] counter = new int[10]; // 몇번 나왔는지 수 저장할 배열

		for (int num = 0; num < numArr.length; num++) {
			numArr[num] = (int) (Math.random() * 10);
			System.out.print(numArr[num] + " "); // 랜덤 수 생성
		}
		System.out.println("");
		
		for(int cot = 0; cot < numArr.length; cot++ ) { //랜덤 수의 갯수 카운트
			counter[numArr[cot]]++; 
		}
		
		for(int i = 0; i < counter.length; i ++ ) {
			
			System.out.println(i + "의 갯수 : " + counter[i]); //랜덤수의 갯수 출력
		}
	}

}
