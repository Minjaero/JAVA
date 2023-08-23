package lottoExam;

import java.util.ArrayList;

public class LottoArrayList {
	
	public void getRandomBall() {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		while(list.size() < 6 ) {
			
			int randomNum = (int)(Math.random()*45)+1;
			
			if(list.contains(randomNum))
				continue;
			
			list.add(randomNum);
		
		}
		
		System.out.println("ArrayList: ");
		
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}

}
