package designSelf;

public class FlexibleCompanyDemoCompositionVersion {

	public static void main(String[] args) {
		
		Employee1[] workers = new Employee1[4];
		
		workers[0] = new Employee1("ö��");
		workers[0].setSalaryRole(new MerClerkSalaryRole(100));
		
		workers[1] = new Employee1("����");
		workers[1].setSalaryRole(new MerClerkSalaryRole(100));
		
		workers[2] = new Employee1("ȫ�浿");
		workers[2].setSalaryRole(new ManagerSalaryRole(200));

		workers[3] = new Employee1("����");
		workers[3].setSalaryRole(new StudentWorker(100));
		
		
		System.out.println("���� ����");
		
		for(int i = 0; i < workers.length; i++) {
			System.out.println(workers[i].getName() +"�� ���� ������" +workers[i].getSalary() + "���� �Դϴ�.");
		}
		System.out.println("");
		
		System.out.println("�ٲ� ����");
		
		for(int i = 0; i < workers.length; i++ ) {
			workers[i].manageSalary(10);
			System.out.println(workers[i].getName() + "�� �ٲ� ������ " + workers[i].getSalary() + "�����Դϴ�.");
		}
		
		System.out.println("");
		System.out.println("ö���� �Ŵ����� �����߽��ϴ�.");
		
		workers[0].setSalaryRole(new ManagerSalaryRole(200));
		workers[0].manageSalary(10);
		System.out.println(workers[0].getName() +"�� �ٲ� ������ �ٲ� ������ " + workers[0].getSalary());
	}

}

class Employee1 {
	String name;
	SalaryRole salaryRole = null;
	
	public Employee1(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return salaryRole.getSalary();
	}
	
	public void manageSalary(double rate) {
		salaryRole.manageSalary(rate);
	}
	
	public void setSalaryRole(SalaryRole salaryRole) {
		this.salaryRole = salaryRole;
	}
}

abstract class SalaryRole{
	double salary;
	
	SalaryRole(double salary) {
		this.salary = salary;	
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void manageSalary(double rate) {}
}

class MerClerkSalaryRole extends SalaryRole {
	public MerClerkSalaryRole(double salary) {
		super(salary);
	}
	
	public void manageSalary(double rate) {
		salary = salary + salary*(rate/100);
	}
}

class ManagerSalaryRole extends SalaryRole {
	public ManagerSalaryRole(double salary) {
		super(salary);
	}
	
	public void manageSalary(double rate) {
		salary = salary + salary*(rate/100);
		salary += 20;
	}
}

class StudentWorker extends SalaryRole {
	public StudentWorker(double rate) {
		super(rate);
	}
	public void manageSalary(double rate) {
		salary = salary + salary*(rate/100);
		salary -= 20;
	}
}


