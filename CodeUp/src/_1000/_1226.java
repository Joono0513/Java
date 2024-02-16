package _1000;

import java.util.Scanner;

// 13 23 24 35 40 45 7 ==> 로또 당첨번호 + 보너스 번호
// 2  5  7  23 40 44 ==> 지혜가 가진 로또 번호

public class _1226 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lotto[] = new int[7];
		int user[] = new int[6];
		int count = 0, bonus = 0;
		
		// 입력
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = sc.nextInt();
		}
		
		for (int i = 0; i < user.length; i++) {
			user[i] = sc.nextInt();
		}
		
		// 비교 a == b
		for (int i = 0; i < user.length; i++) {
			for (int j = 0; j < user.length; j++) {
				// 보너스 번호 빼고만 비교
				if (lotto[i] == user[j]) {
					count++;
				}
			}
		}
		
		// 출력
		switch (count) {
		case 6:
			System.out.println("1");
			break;
		case 5:
			for (int i = 0; i < user.length; i++) {
				if( user[i] == lotto[6] ) {
					bonus = 1;
				}
			}
			if (bonus == 1) {
					System.out.println("2");
			} 
			else {
				System.out.println("3");
			}
			break;
		case 4:
			System.out.println("4");
			break;
		case 3:
			System.out.println("5");
			break;
		default:
			System.out.println("0");
			break;
		}
		
		sc.close();
	}
}