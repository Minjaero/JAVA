package colllectionExam;

import java.util.HashSet;

public class HashSetExam {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("유재석");
		set.add("김종국");
		set.add("송지효");
		set.add("유재석");
		set.add("지석진");
		set.add("하하");
		set.add("전소민");
		set.add("유재석");
	
		System.out.println(set.size());
		
	
		
		if(set.contains("유재석")) {
			System.out.println("ok");
		}
		
		set.remove("유재석");

		for (String s : set) {
			System.out.print(s + " ");
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println(set.size());
		}
		

	}

}
