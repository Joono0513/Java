package Day11.Ex01_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 예외 처리
 * - InputMismatchException
 * : 입력 시, 자료형이 입력메소드와 일치하지 않아서 발생하는 예외 상황
 * ex) nextInt() 에 대하여 정수를 입력하지 않고 다른 자료형(문자 등)을 입력한 경우
 * 
 */

public class InputMismatch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		String menuName = "";
		
		do {
			System.out.println("1. JAVA");
			System.out.println("2. Oracle DB");
			System.out.println("3. HTML");
			System.out.println("4. CSS");
			System.out.println("5. JavaScript");
			System.out.println("0. 종료");
			System.out.print("입력 : ");
			
			// 예외 메시지 	: java.util.InputMismatchException
			// 예외 상황	: 숫자 입력 메소드에 문자를 입력한 경우 등
			try {
				menuNo = sc.nextInt();		// 예외 발생 가능성이 있는 문장
			}
			
			catch(InputMismatchException e) {
				// 숫자를 입력하지 않았으면, 다시 반복해서 입력하도록
				sc.next();				// 입력 스트림에서 남아있는 (엔터)를 제거
				System.err.println("(0 ~ 5)번 사이의 정수를 입력해주세요");
				continue;
			}
			// 종료 조건
			if (menuNo == 0) break;
			
			switch (menuNo) {
				case 1: menuName = "JAVA"; 			break;
				case 2: menuName = "Oracle DB"; 	break;
				case 3: menuName = "HTML";			break;
				case 4: menuName = "CSS"; 			break;
				case 5: menuName = "JavaScript"; 	break;
			}
			System.out.println(menuName + "(을/를) 공부합니다.");
		} while (true);
		sc.close();
	}
}
