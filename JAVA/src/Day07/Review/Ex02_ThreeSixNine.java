package Day07.Review;

public class Ex02_ThreeSixNine {
	
	public static void main(String[] args) {
		// 정수 1 ~ 100까지의 수를 반복하면서,
		// 해당 수가 3 또는 6 또는 9가 될 때,
		// 369의 갯수만큼 "*"를 출력하는 프로그램을 작성하시오.
		// ex)	3		-->		"*"
		//		33		-->		"**"
		//		99		-->		"**"
		//		45		-->		45
		
		// 1. 정수 1 ~ 100까지 출력
		// 2. 해당 수의 3, 6, 9가 몇개인지 판단
		// 2-1. 십의 자리 수가 3, 6, 9인지 여부(A) 판단
		// 2-2. 일의 자리 수가 3, 6, 9인지 여부(B) 판단
		// 2-3. A and B --> **
		// 		A or  B --> *
		// 3. 그 갯수만큼 "*" 출력
		for (int i = 1; i <= 100; i++) {
			// 십의 자리 수 : 해당 수 (i) / 10 (정수 부분만)
			int ten = i / 10;
			// 일의 자리 수 : 해당 수 (i) % 10
			int one = i % 10;
			
			boolean ten369 = (ten != 0) && (ten % 3 == 0);
							//ten == 3 || ten == 6 || ten == 9; 
			boolean one369 = (one != 0) && (one % 3 == 0);
							//one == 3 || one == 6 || one == 9;
			
			if(ten369 && one369) {
				System.out.println("**");
			}
			else if(ten369 || one369) {
				System.out.println("*");
			}
			else {
				System.out.println(i);
			}
		}
		
		
	}
}
