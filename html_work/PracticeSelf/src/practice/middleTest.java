package practice;

public class middleTest {

	public static void main(String[] args) {
		
		for(int col = 2; col < 10; col++ ) {
			for(int row =2; row < 10; row++) {
				int sum = col * row;
				System.out.print(col + "x" + row + "=" + sum + "\t");
			}
			System.out.println();
		}
		

	}

}

