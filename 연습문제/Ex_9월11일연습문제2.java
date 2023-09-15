package 연습문제;

import java.util.Scanner;

public class Ex_9월11일연습문제2 {

	public static void main(String[] args) {
		// 키보드로부터 암호를 입력합니다.
		// ㄱ)암호를 비교하여 같으면 "암호ok" 출력
		// ㄴ)암호가 틀리면"암호가틀립니다. 올바른암호를 입력해주세요."출력
		// ㄷ)암호를 5번 틀리면 "관리자에게 확인해주세요."출력
		Scanner sc = new Scanner(System.in);
		System.out.print("암호는 : ");
		int num = sc.nextInt();
 
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "번 쨰 시도");
			int value = sc.nextInt();
			if (value == num) {
				System.out.println("ok");
			} else if (i < 5) {
				System.out.println("암호가 틀렸습니다!");
			} else {
				System.out.println("암호를 확인해주세요");

			}
		}

	}

}
