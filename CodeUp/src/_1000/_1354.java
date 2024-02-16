package _1000;

/*
 * 길이 n이 입력되면 역삼각형을 출력한다.
 * n이 5이면
 * *****
 * ****
 * ***
 * **
 * *
 */

import java.util.Scanner;

public class _1354 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}