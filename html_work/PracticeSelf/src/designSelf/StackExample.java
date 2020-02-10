package designSelf;

public class StackExample {
	public static void main(String[] args) {
		
		System.out.println("Start Stack\n------------\n");
		Stack example = new Stack();
		example.dispalyStack();
		
		String one = new String("1");
		System.out.print("push :");
		if(example.push(one))
			System.out.println(one);
		else
			System.out.println("Insert Falied");
		example.dispalyStack();
		
		String two = new String("2");
		System.out.print("push :");
		if(example.push(two))
			System.out.println(two);
		else
			System.out.println("Insert Falied");
		example.dispalyStack();
		
		Object result;
		
		System.out.print("pop : ");
		result = example.pop();
		if(result == null)
			System.out.println("Faild");
		else 
			System.out.println(result);
		example.dispalyStack();
		
		System.out.print("pop : ");
		result = example.pop();
		if(result == null)
			System.out.println("Faild");
		else 
			System.out.println(result);
		example.dispalyStack();
		
		System.out.print("pop : ");
		result = example.pop();
		if(result == null)
			System.out.println("Faild");
		else 
			System.out.println(result);
		example.dispalyStack();

	}

}
