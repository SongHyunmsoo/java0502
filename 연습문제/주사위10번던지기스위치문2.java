package 연습문제;

public class 주사위10번던지기스위치문2 {

	public static void main(String[] args) {
		// 주사위를 던진다.
		// 10번 던져서 어떤값이 몇번 나온지 카운팅 하기 스위치문으로

		// 주사위 값에 따라 맞는 횟수를 증가시킨다.
		// 배열 만들기
		// 반복 루프 10번
		// 카운터 6
		// 배열
		// 스위치로 6뽑기
		// int [] 다이스 카운터
	
		int[] 주사위눈횟수 = new int[6];
		// int[]주사위눈횟수행렬
		
		for (int i = 0; i < 10; i++) {

			int num = (int) (Math.random() * 6 +1 );
			
			switch (num) {
			case 1:
				
					주사위눈횟수[0]++;
					
					break;
				
			case 2:
				
				    주사위눈횟수[1]++;
					
					break;
				
			case 3:
				
				    주사위눈횟수[2]++;
					
					break;
				
			case 4:
				    주사위눈횟수[3]++;
					
					break;
				
			case 5:
				    주사위눈횟수[4]++;
					break;
				
			case 6:
				   주사위눈횟수[5]++;
					break;
				}
//			default:
//				System.out.println("오류");
//				break;

			}
		for (int i = 0; i < 6; i++) {
			System.out.println("[" +(i+1)+"]" + 주사위눈횟수[i]);
		// System.out.println(주사위눈횟수[num]);
		}
	}
}
/**
 * 1.주사우의 눈금의 수를 기호상수로 정의 나중에 눈금의 수가 변하더라도 프로그램 코드를 고칠필요 없다. 2.주사위를 던져서 나온 눈의
 * 횟수를 측정할 변수 diceCount를 선언한다. 이번수는 1의 눈 2의눈 .... 6의눈 등에도 공통(각주사위 눈을 얻어내는 방법) 되게
 * 작용하므로 이런경우 배열이 적격 3.각 자사위의 눈을 구하기 위해 주사위를 반복해서 던져야 한다. 똑같은 동작을 반복하므로 루프가 제격
 * 횟수가 정해져 있으니 for문 사용 4.난수는 Math.random()으로 구하면 된다. 주사위 눈금은
 * (int)(Math.random()*6)+1; 배열의 인덱스가 주사위의 눈금을 이미 배열은 그 눈금의 출현횟수를 의미 5.결과 출력뷰
 * 
 */
