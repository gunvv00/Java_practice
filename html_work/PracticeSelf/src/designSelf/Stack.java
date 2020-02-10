package designSelf;

public class Stack {

	static final int MAX_STACK = 10;
	private Object[] item;
	private int top;

	public Stack() {
		top = -1;
		item = new Object[MAX_STACK];
	}

	public boolean stackisEmpty() {
		return (top < 0);
	}

	public boolean stackisFull() {
		return (top >= MAX_STACK);
	}

	public boolean push(Object newItem) {
		if (stackisFull())
			return false;
		else {
			top++;
			item[top] = newItem;
			return true;
		}
	}

	public Object pop() {
		if (stackisEmpty())
			return null;
		else
			return item[top--];
	}

	public Object getStackTop() {
		if (stackisEmpty())
			return null;
		else
			return item[top];
	}

	public void dispalyStack() {
		if (stackisEmpty())
			System.out.println("Empty Stack");
		else {
			System.out.println("Stack\n-------");
			for (int i = top; i >= 0; i++)
				System.out.println(item[i]);
			System.out.println(" ");
		}
	}

}
