package javajungsuk2;
import java.util.*;

public class ArrayListEx1 {
	public static void main(String[] args) {
		// 배열과 비슷하며 데이터를 add 하면 0번 index부터 데이터가 추가된다.
		// 배열과 달리 size는 데이터가 추가되면 증가한다.
		
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
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2)); //리스트1에 리스트2에 들어있는 데이터가 전부 포함되어있는가
		
		list2.add("B"); // 제일 뒤에 추가
		list2.add("C"); // 제일 뒤에 추가
		list2.add(3,"A"); //3번째의 위치에 "A"를 넣는다
		print(list1, list2);
		
		list2.set(3,"AA"); //3번 Index의 데이터를 "AA"로 교체
		print(list1, list2);
		
		//리스트1에있는 리스트2의 값을 제외하고 리스트1의 값을 지운다
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2)); 
		print(list1, list2);
		
		//list2에서 list1에 포함된 데이터들을 삭제한다
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
