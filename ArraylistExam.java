package colllectionExam;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistExam {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("유재석");
		list.add("지석진");
		list.add("김종국");
		list.add("송지효");
		list.add("하하");
		
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		
		list.add(3, "김영철");
			
		for (String s : list) {
			System.out.print(s + " ");
		
		}
		
		list.remove("김종국");
		System.out.println(list.size());
		
		list.remove(list.size()-1);
		
		list.set(0, "이수근");
		
		System.out.println(list.indexOf("송지효"));
		
		if(list.contains("송지효"));
			System.out.println("ok");
		
		list.clear();
		
		if(list.isEmpty())
			System.out.println("비어있습니다");
		
		
		list.add("유재석");
		list.add("지석진");
		list.add("김종국");
		list.add("송지효");
		list.add("하하");
		
		Collections.sort(list);
		
		for (String s : list) {
			System.out.print(s + " ");
		}
		
	}

}
