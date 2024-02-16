package _1000;

import java.util.Scanner;

public class _1155 {
	
	// 어떤 정수가 입력되면 그 수가 7의 배수인지 확인하시오.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x % 7 == 0) {
			System.out.println("multiple");
		}else {
			System.out.println("not multiple");
		}
		
		sc.close();
	}

}
