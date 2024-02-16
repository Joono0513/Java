package _1000;

import java.util.Scanner;

public class _1154 {
	
	// 정수 두개가 입력으로 들어오면 큰 수 - 작은 수의 값을 출력하시오

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > y) {
			System.out.println(x - y);
		}else {
			System.out.println(y - x);
		}
		
		sc.close();

	}

}
