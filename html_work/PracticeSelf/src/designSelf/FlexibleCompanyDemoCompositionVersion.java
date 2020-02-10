package designSelf;

public class FlexibleCompanyDemoCompositionVersion {

	public static void main(String[] args) {
		
		Employee1[] workers = new Employee1[4];
		
		workers[0] = new Employee1("철수");
		workers[0].setSalaryRole(new MerClerkSalaryRole(100));
		
		workers[1] = new Employee1("영희");
		workers[1].setSalaryRole(new MerClerkSalaryRole(100));
		
		workers[2] = new Employee1("홍길동");
		workers[2].setSalaryRole(new ManagerSalaryRole(200));

		workers[3] = new Employee1("병량");
		workers[3].setSalaryRole(new StudentWorker(100));
		
		
		System.out.println("현재 월급");
		
		for(int i = 0; i < workers.length; i++) {
			System.out.println(workers[i].getName() +"의 현재 월급은" +workers[i].getSalary() + "만원 입니다.");
		}
		System.out.println("");
		
		System.out.println("바뀐 월급");
		
		for(int i = 0; i < workers.length; i++ ) {
			workers[i].manageSalary(10);
			System.out.println(workers[i].getName() + "의 바뀐 월급은 " + workers[i].getSalary() + "만원입니다.");
		}
		
		System.out.println("");
		System.out.println("철수가 매니저로 승진했습니다.");
		
		workers[0].setSalaryRole(new ManagerSalaryRole(200));
		workers[0].manageSalary(10);
		System.out.println(workers[0].getName() +"의 바뀐 승진후 바뀐 월급은 " + workers[0].getSalary());
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


