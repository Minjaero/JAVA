package colllectionExam;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistExam {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("���缮");
		list.add("������");
		list.add("������");
		list.add("����ȿ");
		list.add("����");
		
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		
		list.add(3, "�迵ö");
			
		for (String s : list) {
			System.out.print(s + " ");
		
		}
		
		list.remove("������");
		System.out.println(list.size());
		
		list.remove(list.size()-1);
		
		list.set(0, "�̼���");
		
		System.out.println(list.indexOf("����ȿ"));
		
		if(list.contains("����ȿ"));
			System.out.println("ok");
		
		list.clear();
		
		if(list.isEmpty())
			System.out.println("����ֽ��ϴ�");
		
		
		list.add("���缮");
		list.add("������");
		list.add("������");
		list.add("����ȿ");
		list.add("����");
		
		Collections.sort(list);
		
		for (String s : list) {
			System.out.print(s + " ");
		}
		
	}

}
