package _1000;

/*
 * 길이 n이 입력되면 다음과 같은 사각형을 출력한다.
 * n이 5일때,
 * *****
 * *   *
 * *   *
 * *   *
 * *****
 */

import java.util.Scanner;

public class _1356 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}