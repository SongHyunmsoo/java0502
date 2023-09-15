package 연습문제;

import java.util.Scanner;

public class Ex_9월11일연습문제1 {
	public static void main(String[] args) {
		// 3개의 정수값을 입력받아 가장 큰 수를 구하시오
		// 정수 입력은 Scanner 사용하여 입력
		// 세가지수 100,200,300

		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수의 최댓값을 구합니다.");
		
		System.out.print("첫번째 정수를 입력:");
		int i = sc.nextInt();
		System.out.print("두번째 정수를 입력:");
		int j =  sc.nextInt();
		System.out.print("세번째 정수를 입력:");
		int k =  sc.nextInt();

		// 두개의 정수를 비교하여 큰 정수를 max 변수에 대입
		int max = 0; // 현재 비교한 최대값이 없음
		// 데이터 정수 변수 두개 선언
		// i>j를 비교해서 큰 값을 max에 대입하기
		// 크다는 비교 연산자 사용
		if (i >= j && i >= k) {
			max = i; // i가 j보다 크다.
		} else if (j >= i && j >= k) {// i가j랑 같다
			max = j;
		} else if (k >= i && k >= j) {
			max = k;

		}
		System.out.println(i + "," + j + "," + k + "중 max 값은:" + max);

		// int max = 0;

	}
}
