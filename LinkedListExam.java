package colllectionExam;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("���缮");
		list.add("������");
		list.add("������");
		list.add("����ȿ");
		list.add("����");
		
		System.out.println(list.get(0));
		System.out.println(list.getFirst());
		
		list.add(3, "�迵ö");
		list.addFirst("������");
		list.addLast("����ö");
		
		for (String s : list) {
			System.out.println(s);
		}
		
		list.remove(list.size()-1);
		list.removeFirst();
		list.removeLast();
		
		list.set(0, "�̼���");
		
		System.out.println(list.indexOf("����ȿ"));
		
		
		if(list.contains("����ȿ")) {
			System.out.println("ok");
		}
		
		list.clear();
		if(list.isEmpty()) {
			System.out.println(list.size());
		}
		
		Collections.sort(list);
		
		for (String s : list) {
			System.out.println(s);
		}
		
	
		
		

	}

}
