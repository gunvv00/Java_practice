package designSelf;

public class FlexibleCompanyDemoNoInterfaceVersion {
	public static void main(String[] args) {
		HumanWorker[] workers = new HumanWorker[3];
		
		workers[0] = new ManWorker("철수");
		workers[0].setSalaryRole(new MereClerkSalaryRole(100));
		
		workers[1] = new WomanWorker("영희");
		workers[1].setSalaryRole(new MereClerkSalaryRole(100));
		
		workers[2] = new ManWorker("홍길동");
		workers[2].setSalaryRole(new ManagerSalaryRole1(100));
		
		System.out.println("현재 월급");
		for(int i = 0; i < workers.length; i ++ ) {
			System.out.println(workers[i].getName() + "의 월급은 " + workers[i].getSalary() + "입니다");
		}
		
		System.out.println("변경후 월급은");
		for(int i = 0; i < workers.length; i++ ) {
			workers[i].manageSalary(10);
			System.out.println(workers[i].getName()+"의 변경된 월급은" + workers[i].getSalary() + "입니다.");
		}
		
		System.out.println("철수가 매니저로 승진함.");
		workers[0].setSalaryRole(new ManagerSalaryRole1(200));
		workers[0].manageSalary(10);
		System.out.println("승진후 월급은 >>" + workers[0].getSalary());
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