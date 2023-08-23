package colllectionExam;

import java.util.HashMap;

public class HashMapExam {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("유재석", 10);
		map.put("박명수", 5);
		map.put("김종국", 3);
		
		System.out.println(map.size());
		
		System.out.println(map.get("유재석"));
		System.out.println(map.get("박명수"));
		System.out.println(map.get("김종국"));
		
		if(map.containsKey("서장훈")) {
			int num = map.get("서장훈");
			num += 1;
			map.put("서장훈", num);
			
		}
		
		else {
			map.put("서장훈", 1);
		}
		
		map.remove("유재석");
		
		for (String s : map.keySet()) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		for (Integer i : map.values()) {
			System.out.print(i + " ");
		}
		//키 값에 따른 value 값을 출력하고 싶다
		for (String s : map.keySet()) {
			System.out.print("key :" + s + ", value :" + map.get(s));
			
		}
		
	}

}
