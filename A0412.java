import java.util.Scanner;
public class A0412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num1 = 3;
		//int num2= 7;
		//if(++num1 < 5 | ++num2 > 8)
		//	System.out.println(num1);
		
		//System.out.println(num2);
		
		//int num1 = 3;
		//int num2 = 7;
		
		//if(++num1 < 5 || ++num2 > 8)
		//	System.out.println(num1);
		//System.out.println(num2);
		
//		for(int i=1; i <=4; i++) {
//			for(int j=1; j<=3; j++)     문제2 (2)
//				System.out.print(i);
//				System.out.println();
//		}
		
		for(int i=3; i>=1; i--) {
			for(int j=1; j<=i; j++)
				System.out.print(j);
			System.out.print("\n");
		}
	}

}
