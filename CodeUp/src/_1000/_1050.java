package _1000;

/**
 * 두 정수(a, b)를 입력받아 
 * a와 b가 같으면 1을, 같지 않으면 0을 출력하는 프로그램을 작성해보자.
 */

import java.util.Scanner;

public class _1050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x == y) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
		sc.close();
	}
}
