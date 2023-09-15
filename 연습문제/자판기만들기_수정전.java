package 연습문제;

import java.util.Scanner;

public class 자판기만들기_수정전 {
	public static void main(String[] args) {
		boolean rum = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		int scrum = sc.nextInt();
		while(rum) {
			System.out.println("-------------");
			System.out.println("1.예금|2.출금| 3.잔고| 4.종료");
			System.out.println("-------------");
			System.out.println("선택>");
			switch (scrum) {
			case 1 : 
				System.out.println("-------------");
				System.out.println("선택>1\n예금액>10000");
				System.out.println("-------------");
				break;
			case 2 :
				System.out.println("-------------");
				System.out.println("선택>2\n출금액>2000");
				System.out.println("-------------");
				break;
			case 3 : 
				System.out.println("-------------");
				System.out.println("선택>3\n잔고>8000");
				System.out.println("-------------");
				break;
			case 4 : 
				System.out.println("-------------");
				System.out.println("선택>4\n 프로그램종료");
				System.out.println("-------------");
				break;
			default:
				System.out.println("-------------");
				System.out.println("오류");
				break;
				
			}
			System.out.println("종료");
		}
	}
}

//nextLine 으로 하면 정수로 변환
//밸런스+입금액 .잔고

