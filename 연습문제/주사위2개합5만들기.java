package 연습문제;

public class 주사위2개합5만들기 {
	public static void main(String[] args) {
		// 루프가 필요한가요? 네
		// while(true){
		// {
		// 난수가 필요한가요? 네
		// (int)(Math.random() * 6) + 1;
		// 두주사위의 눈내용을 출력하세요
		// System.out.printf("%d,%d",num1,num2) 
		// 팁 프린트ln보다는 프린트f가 좀더 깔끔하다. 정형화된 출력에 좋음;
//		int = num1 = 0;
//		int = num2 = 0;
		// 브루마블 + 채팅
		// 전략 윷놀이 + 채팅 심리
		// 초기값, 연산식, 조건
		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.printf("(%d,%d)",num1,num2);
			if ((num1 + num2) ==5)  {
				break;
				
			}
			
		}
	}
}
