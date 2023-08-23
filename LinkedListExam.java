package colllectionExam;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("À¯Àç¼®");
		list.add("Áö¼®Áø");
		list.add("±èÁ¾±¹");
		list.add("¼ÛÁöÈ¿");
		list.add("ÇÏÇÏ");
		
		System.out.println(list.get(0));
		System.out.println(list.getFirst());
		
		list.add(3, "±è¿µÃ¶");
		list.addFirst("¼­ÀåÈÆ");
		list.addLast("±èÈñÃ¶");
		
		for (String s : list) {
			System.out.println(s);
		}
		
		list.remove(list.size()-1);
		list.removeFirst();
		list.removeLast();
		
		list.set(0, "ÀÌ¼ö±Ù");
		
		System.out.println(list.indexOf("¼ÛÁöÈ¿"));
		
		
		if(list.contains("¼ÛÁöÈ¿")) {
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
