package classPractice;

import java.util.*;

public class SumExe {
	public static void main(String[] args) {
		HowSum asad = new HowSum(8, 11);
		asad.sumAll();
	}

}

class HowSum {
	int startNum;
	int endNum;
	
	public HowSum(int startNum, int endNum) {
		this.startNum = startNum;
		this.endNum = endNum;
	}
	void sumAll() {
		int sum = 0;
		if(startNum>endNum)
		{
			 int temp = startNum;
			 startNum = endNum;
			 endNum = temp;
		}
		for(int i = startNum; i <= endNum; i++) {
			sum += i;
		}
		System.out.println(startNum + "부터" + endNum +"까지의 합은 : " + sum);

	}


}