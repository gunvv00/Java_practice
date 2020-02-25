package designSelf;

public class FlexibleCompanyDemoInterfaceVersion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Worker {
	public String getName();
	
	public void setName(String name);
	
	public void setSalaryRole(SalaryRole salaryRole);
	
	public SalaryRole getSalaryRole();
	
	public double getSalary();
	
	public void setSalary(double salary);
	
	public void manageSalary(double rate);
}

abstract class HumanWorker1 implements Worker {
	String name;
	SalaryRole salaryRole = null;
	
	public HumanWorker1(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
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

class ManWorker extends HumanWorker1  {
	public ManWorker(String name) {
		super(name);
	}
	public void doShaving() {
		System.out.println("면도를 한다.");
	}
	
}

class WomanWorker extends HumanWorker1 {
	public WomanWorker(String name) {
		super(name);
	}
	public void doMakeup() {
		System.out.println("화장을 한다.");
	}
}


abstract class Animal implements Worker {
	String name;
	SalaryRole salaryRole = null;
}








