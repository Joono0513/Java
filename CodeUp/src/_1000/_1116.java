package _1000;

/**
 * 두 정수를 입력받아 아래와 같이 출력하시오
 * 
 * 
*/
import java.util.Scanner;

public class _1116 {

	public static void main(String[] args) {
		// 1. 두 정수 입력
		// 2. 덧셈/뺄셈/곱셈/나눗셈 결과 구하기
		// 3. 출력 양식에 맞게 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		int x= sc.nextInt();
		int y= sc.nextInt();
		
		int sum = x + y;
		int min = x - y;
		int mul = x * y;
		int div = x / y;
		
		System.out.println(x + "+" + y + "=" + sum);
		System.out.println(x + "-" + y + "=" + min);
		System.out.println(x + "*" + y + "=" + mul);
		System.out.println(x + "/" + y + "=" + div);
		
		/**
		 * 좀 더 간결한 코드
		 * System.out.println(x + "+" + y + "=" + (x + y));
		 * System.out.println(x + "-" + y + "=" + (x - y));
		 * System.out.println(x + "*" + y + "=" + (x * y));
		 * System.out.println(x + "/" + y + "=" + (x / y));
		 */
		
		sc.close();
	}

}
