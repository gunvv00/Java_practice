package classPractice;
import java.io.*;

public class MethodEx {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.lottoCreate();
		lotto.printResult();
		
	}
}

class Lotto {
	int num[] = new int[7];

	public void lottoCreate() {
		for(int i = 0; i < 7; i++ ) {
			num[i] = (int)(Math.random() * 45) +1;
			for(int j = 0; j < i; j++ ) { 
				if(num[i] == num[j]){
					i--;
					break;
				}
			}
		}
	}
	public void printResult() { 
		System.out.println("----로또 번호-------" );
		for(int i = 0; i < 7; i++) {
			System.out.print(i+1 + "번째 공은: " );
			System.out.println(num[i] + " ");
		}
	}
	
}
