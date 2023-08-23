package colllectionExam;

import java.util.HashMap;

public class HashMapExam {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("���缮", 10);
		map.put("�ڸ��", 5);
		map.put("������", 3);
		
		System.out.println(map.size());
		
		System.out.println(map.get("���缮"));
		System.out.println(map.get("�ڸ��"));
		System.out.println(map.get("������"));
		
		if(map.containsKey("������")) {
			int num = map.get("������");
			num += 1;
			map.put("������", num);
			
		}
		
		else {
			map.put("������", 1);
		}
		
		map.remove("���缮");
		
		for (String s : map.keySet()) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		for (Integer i : map.values()) {
			System.out.print(i + " ");
		}
		//Ű ���� ���� value ���� ����ϰ� �ʹ�
		for (String s : map.keySet()) {
			System.out.print("key :" + s + ", value :" + map.get(s));
			
		}
		
	}

}
