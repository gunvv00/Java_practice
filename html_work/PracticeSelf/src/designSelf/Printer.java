package designSelf;

public abstract class Printer implements Printable {
	private String ID;
	
	
	public Printer(String ID) {
		this.ID = ID;
	}
	
	public String getID() {
		return ID;
	}
	
	abstract public void print(Object msg);
}
