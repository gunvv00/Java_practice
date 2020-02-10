package designSelf;

public class FlexibleCompanyDemo {

	public static void main(String[] args) {
		
		Employee[] workers = new Employee[3];
		
		workers[0] = new MereClerk("ö��", 100);
		workers[1] = new MereClerk("����", 100);
		workers[2] = new Manager("ȫ�浿", 200);
		
		System.out.println("���� �����Դϴ�.");
		
		for(int i = 0; i < workers.length; i++) {
			System.out.println(workers[i].getName() + "�� ���� ������ " + workers[i].getSalary() + "�Դϴ�.");
		}
		System.out.println("");
		
		System.out.println("�λ�� �����Դϴ�.");
		
		for(int i = 0; i < 3; i++) {
			workers[i].manageSalary(10);
			System.out.println(workers[i].getName() + "�� �λ�� ������ " + workers[i].getSalary() + "�Դϴ�.");
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





