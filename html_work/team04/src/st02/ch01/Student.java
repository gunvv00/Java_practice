package st02.ch01;

public class Student {
	String name;
	Student(String name) {
		this.name = name;
	}
	
	public boolean equals(Object obj) {//자식 타입을 부모타입으로 형변환 되는건 자동으로 가능하다
		
		Student s = (Student)obj;//부모타입을 자식 타입으로 형변환 시켜줌
		
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