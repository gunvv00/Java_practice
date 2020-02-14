package designSelf;

public class FlexibleCompanyDemoNoInterfaceVersion {
	public static void main(String[] args) {
		HumanWorker[] workers = new HumanWorker[3];
		
		workers[0] = new ManWorker("ö��");
		workers[0].setSalaryRole(new MereClerkSalaryRole(100));
		
		workers[1] = new WomanWorker("����");
		workers[1].setSalaryRole(new MereClerkSalaryRole(100));
		
		workers[2] = new ManWorker("ȫ�浿");
		workers[2].setSalaryRole(new ManagerSalaryRole1(100));
		
		System.out.println("���� ����");
		for(int i = 0; i < workers.length; i ++ ) {
			System.out.println(workers[i].getName() + "�� ������ " + workers[i].getSalary() + "�Դϴ�");
		}
		
		System.out.println("������ ������");
		for(int i = 0; i < workers.length; i++ ) {
			workers[i].manageSalary(10);
			System.out.println(workers[i].getName()+"�� ����� ������" + workers[i].getSalary() + "�Դϴ�.");
		}
		
		System.out.println("ö���� �Ŵ����� ������.");
		workers[0].setSalaryRole(new ManagerSalaryRole1(200));
		workers[0].manageSalary(10);
		System.out.println("������ ������ >>" + workers[0].getSalary());
	}

}

class HumanWorker {
	String name;
	SalaryRole salaryRole = null;
	
	public HumanWorker(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return salaryRole.getSalary();
	}
	
	public void setSalary(double salary) {
		salaryRole.setSalary(salary);
	}
	
	public void manageSalary(double rate) {
		salaryRole.manageSalary(rate);
	}
	
	public void setSalaryRole(SalaryRole salaryRole) {
		this.salaryRole = salaryRole;
	}
	
	public SalaryRole getSalaryRole() {
		return salaryRole;
	}
}


abstract class SalaryRole1 {
	double salary;
	
	SalaryRole1(double salary) {
		this.salary = salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void getSalary(double salary) {
		this.salary = salary;
	}
	
	public void manageSalary(double rate) {}
	
}

class MereClerkSalaryRole extends SalaryRole {
	public MereClerkSalaryRole(double salary) {
		super(salary);
	}
	
	public void manageSalary(double rate) {
		salary = salary + salary*(rate/100);
	}
}

class ManagerSalaryRole1 extends SalaryRole {
	public ManagerSalaryRole1(double salary) {
		super(salary);
	}
	
	public void manageSalary(double rate) {
		salary = salary + salary*(rate/100);
		salary += 20;
	}
}