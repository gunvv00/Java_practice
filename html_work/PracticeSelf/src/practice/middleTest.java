package practice;

public class middleTest {

	public static void main(String[] args) {
		
		for(int col = 1; col < 10; col++ ) {
			for(int row =2; row < 10; row++) {
				int sum = row * col;
				System.out.print(row + "x" + col + "=" + sum + " ");
			}
			System.out.println();
		}
		

	}

}
