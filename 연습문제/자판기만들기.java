package 연습문제;

import java.util.Scanner;

public class 자판기만들기 {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int menuNum = Integer.parseInt(scanner.nextLine());
		
		switch (menuNum) {
		case 1:
			System.out.print("예금액😃 ");
			int amount = Integer.parseInt(scanner.nextLine());
			balance = balance + amount;
			break;
		case 2:
			System.out.print("출금액😃 ");
			int amount = Integer.parseInt(scanner.nextLine());
			balance = balance - amount;
			break;

		case 3:
			System.out.print("잔고😃 ");
			System.out.println(balance);
			break;
		case 4:
			run = false;
			break;
		}

		System.out.println();
	}
}
