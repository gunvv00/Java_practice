package designSelf;

public class InterfaceTest {
	public static void main(String[] args) {
		
		
		A a = new A();
		A b = new B();
		
		((B)b).methodB1();
		a.methodA1();
		b.methodA1();
		

	}

}


class A {
	public void methodA1() {
		System.out.println("AŬ���� method");
	}
	
	public void methodA2() {
		System.out.println("A2Ŭ���� method");
	}
	
	public void methodA3() {
		System.out.println("A3Ŭ���� method");
	}
}

class B extends A {
	public void methodA1() {
		System.out.println("BŬ���� method");
	}
	
	public void methodB1() {
		System.out.println("B1Ŭ���� method");
	}
	
	public void methodB21() {
		System.out.println("B2Ŭ���� method");
	}
}