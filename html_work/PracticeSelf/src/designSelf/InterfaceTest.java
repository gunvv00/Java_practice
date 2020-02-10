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
		System.out.println("A클래스 method");
	}
	
	public void methodA2() {
		System.out.println("A2클래스 method");
	}
	
	public void methodA3() {
		System.out.println("A3클래스 method");
	}
}

class B extends A {
	public void methodA1() {
		System.out.println("B클래스 method");
	}
	
	public void methodB1() {
		System.out.println("B1클래스 method");
	}
	
	public void methodB21() {
		System.out.println("B2클래스 method");
	}
}