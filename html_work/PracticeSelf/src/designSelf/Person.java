package designSelf;

public abstract class Person {
	public abstract String getGender();
}

class Man extends Person{
	public String getGender() {
		return "male";
	}

}

class Woman extends Person{
	public String getGender() {
		return "female";
	}

}
