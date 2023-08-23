package lottoExam;


import java.util.HashSet;

public class LottoHashSet {
	
	
	public void getRandomBall() {
		
		HashSet<Integer> set = new HashSet<>();
		
		while(set.size() < 6 ) {
			
			int randomNum = (int)(Math.random()*45)+1;
			
			if(set.contains(randomNum))
				continue;
			
			set.add(randomNum);
		
		}
		
		System.out.println("HashSet : ");
		for (Integer i : set) {
			System.out.print(	i + " ");
		}
		System.out.println();
		
		
		
	}

}
