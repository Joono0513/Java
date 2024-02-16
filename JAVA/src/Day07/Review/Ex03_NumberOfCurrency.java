package Day07.Review;

import java.util.Scanner;

/*
 * 더조은컴퓨터아카데미에서 김조은 대리를 출장보낸다.
 * 이 때, 출장비를 다음과 같이 지급한다.
 * 출장비 	: 537,520
 * 50,000	: 10장
 * 10,000	: 3장
 * 5,000	: 1장
 * 1,000	: 2장
 * 500		: 1개
 * 100		: 1개
 * 50		: 0개
 * 10		: 2개
 * 위와 같이 입력하면, 
 * 큰 화폐 단위부터 계산하여,
 * 화폐 단위 별로 화폐 매수를 출력하는 프로그램을 작성하시오.
 */

public class Ex03_NumberOfCurrency {

	public static void main(String[] args) {
		/*
		 * (순서도)
		 * 1. 필요한 변수 선언
		 * - 값(출장비, 화폐 단위)을 입력받는다
		 * - (입력 금액), (화폐 매수), (화폐 단위)
		 * 2. (입력 금액) 입력
		 * 3. 화폐 매수 계산
		 * [조건] : 큰 화폐 단위부터 계산한다.
		 * 3-1. 화폐 매수 계산 수식
		 * 		10 = 537620 / 50000
		 * 		(화페 매수) = (입력 금액) / (화폐 단위)
		 * 3-2. 잔액 계산
		 * 		(잔액) = 537620 - 500000 = 37620
		 * 		i)	(잔액) = (입력 금액) - ((화폐 단위)*(화폐 매수))
		 * 		ii)	(잔액) = (입력 금액) % (화폐 단위)
		 * 3-3. 화폐 단위 변환
		 * 		번갈아 가면서, /5, /2 연산을 반복한다.
		 * 		(화폐 단위) = (화폐 단위) / 5
		 * 		(화폐 단위) = (화폐 단위) / 2
		 * 4. 3번의 과정을 반복
		 * - 반복 조건 : (화폐 단위) 1보다 크거나 같으면 반복
		 * 5. 3-1 과정에서 화폐 매수를 출력한다.
		 */
		
		// 필요한 변수 : 입력 금액, 화폐 매수, 화폐 단위
		int input, count, money = 50000;
		
		// 입력 금액 입력
		System.out.print("출장비 : ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		boolean sw = true;
		
		while (money >= 1) {	
			// 화폐 매수 계산
			count = input / money;
			System.out.println(money + "\t : " + count + " 개");
			
			// 잔액 계산
			input = input - (money * count);
			// input = input % money;
			
			// 화폐 단위 변환
			if(sw) {
				money = money / 5;
			}
			else {
				money = money / 2;
			};
			sw = !sw;
		}
		
		sc.close();
	}
}
