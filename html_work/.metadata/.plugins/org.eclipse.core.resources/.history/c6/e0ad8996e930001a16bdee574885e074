package practice;

class/*키워드*/ Calculator/*new를 통해 만든 객체*/{
	
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}


public class CalculatorDemo4 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();//Calculator라는 객체 생성 후 c1이라는 변수에 객체를 담음
		c1.setOprands(10, 20);//c1안에있는 메소드에 10,20이라는 인수를 넣음
		c1.sum();//값 : 30
		c1.avg();//값 : 15
		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();

	}

}
