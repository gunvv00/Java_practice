package designSelf;

public class FlexibleCompanyDemo {

	public static void main(String[] args) {
		
		Employee[] workers = new Employee[3];
		
		workers[0] = new MereClerk("철수", 100);
		workers[1] = new MereClerk("영희", 100);
		workers[2] = new Manager("홍길동", 200);
		
		System.out.println("현재 월급입니다.");
		
		for(int i = 0; i < workers.length; i++) {
			System.out.println(workers[i].getName() + "의 현재 월급은 " + workers[i].getSalary() + "입니다.");
		}
		System.out.println("");
		
		System.out.println("인상된 월급입니다.");
		
		for(int i = 0; i < 3; i++) {
			workers[i].manageSalary(10);
			System.out.println(workers[i].getName() + "의 인상된 월급은 " + workers[i].getSalary() + "입니다.");
		}

	}

}

abstract class Employee {
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void manageSalary(double rate) {}
	
}

class MereClerk extends Employee {
	public MereClerk(String name, double salary) {
		super(name,salary);
	}
	
	public void ManageSalary(double rate) {
		salary = salary + salary*(rate/100);
		
	}
}

class Manager extends Employee {
	public Manager(String name, double salary) {
		super(name,salary);
	}
	
	public void manageSalary(double rate) {
		salary = salary + salary*(rate/100);
		salary += 20;
	}
}






