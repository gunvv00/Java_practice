package javajungsuk2;
import java.util.*;

public class ArrayListEx1 {
	public static void main(String[] args) {
		// �迭�� ����ϸ� �����͸� add �ϸ� 0�� index���� �����Ͱ� �߰��ȴ�.
		// �迭�� �޸� size�� �����Ͱ� �߰��Ǹ� �����Ѵ�.
		
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1,4));
		
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2)); //����Ʈ1�� ����Ʈ2�� ����ִ� �����Ͱ� ���� ���ԵǾ��ִ°�
		
		list2.add("B"); // ���� �ڿ� �߰�
		list2.add("C"); // ���� �ڿ� �߰�
		list2.add(3,"A"); //3��°�� ��ġ�� "A"�� �ִ´�
		print(list1, list2);
		
		list2.set(3,"AA"); //3�� Index�� �����͸� "AA"�� ��ü
		print(list1, list2);
		
		//����Ʈ1���ִ� ����Ʈ2�� ���� �����ϰ� ����Ʈ1�� ���� �����
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2)); 
		print(list1, list2);
		
		//list2���� list1�� ���Ե� �����͵��� �����Ѵ�
		for(int i = list2.size() - 1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		
		

	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}

}