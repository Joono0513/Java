package _1000;

/*
 * 길이 n이 입력되면 다음과 같은 역삼각형을 출력한다.
 * n이 5이면
 * *****
 *  ****
 *   ***
 *    **
 *     *
 */

import java.util.Scanner;

public class _1355 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i <= j) {
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