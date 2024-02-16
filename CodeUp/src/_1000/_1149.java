package _1000;

/*
 * 두 정수 중 큰 정수를 출력한다.
 */

import java.util.Scanner;

public class _1149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > y) {
			System.out.println(x);
		}
		else {
			System.out.println(y);
		}
		
		sc.close();
	}

}
