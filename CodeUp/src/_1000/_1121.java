package _1000;

/*
 * 정수 계산에서 나머지를 구하시오.
 * 예를 들어
 * 7 / 5 의 나머지는 2입니다.
 */

import java.util.Scanner;

public class _1121 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(x % y);
		
		sc.close();
	}

}
