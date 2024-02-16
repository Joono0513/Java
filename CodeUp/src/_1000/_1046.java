package _1000;

/**
 * 정수 3개를 입력받아 합과 평균을 출력해보자.
 * 단, -2147483648 ~ +2147483647
 */

import java.util.Scanner;

public class _1046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int sum = x + y + z;
		double avg = (double)sum / 3;
		
		System.out.println(x + y + z);
		System.out.printf("%.1f", avg);
		
		sc.close();
	}
}
