package st02.ch01;

public class Student {
	String name;
	Student(String name) {
		this.name = name;
	}
	
	public boolean equals(Object obj) {//�ڽ� Ÿ���� �θ�Ÿ������ ����ȯ �Ǵ°� �ڵ����� �����ϴ�
		
		Student s = (Student)obj;//�θ�Ÿ���� �ڽ� Ÿ������ ����ȯ ������
		
		return this.name == s.name;
	}

}

class ObejctDemo {
	public static void main(String[] args) {
		
		Student st1 = new Student("egoing");
		Student st2 = new Student("egoing");
		
		System.out.println(st1 == st2);
		System.out.println(st1.equals(st2));
	}
}