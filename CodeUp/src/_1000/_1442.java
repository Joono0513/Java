package _1000;

import java.util.Scanner;

// 오름차순 선택 정렬

public class _1442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int temp, min = 0;

		// 배열에 n개 만큼 데이터 입력
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 반복문을 통해 비교 → 작은 값 min에 넣어줌
		for (int i = 0; i < n - 1; i++) {
			min = i;
			for (int j = i + 1; j < n; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
