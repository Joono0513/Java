package Day03;

import java.util.Scanner;

public class Ex04_Nested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정보처리기사 자격증 합격 기준
		// 4학년, 60점 이상 - 합격
		System.out.print("학년 : ");
		int year = sc.nextInt();
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		// 4학년
//		if(year == 4) {
//			// 60점 이상
//			if(score >= 60) {
//				System.out.println("합격!");
//			}
//			else {
//			System.out.println("불합격!");
//			}
//		}
//		else {
//			System.out.println("응시자격 요건에 해당되지 않습니다.");
//		}
		
		// 중첩 if문을 단독 if문으로 변경해보세요

		if(year == 4 && score >= 60) {
			System.out.println("합격!");
		}
		else if(year == 4 && score < 60) {
			System.out.println("불합격!");
		}
		else {
			System.out.println("응시자격 요건에 해당되지 않습니다.");
		}
		
		// 조건문(if)을 중첩하지 않고 조건을 줄 수 있다.
		// ** 중첩 if문은 권장하지 않는다.
	}

}
