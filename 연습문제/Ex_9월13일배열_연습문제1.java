package 연습문제;

public class Ex_9월13일배열_연습문제1 {
	public static void main(String[] args) {
		// 배열을 선언하기
		// 10명의 학생성적 저장하는 배열
		// 선언만 했다.
//		int[] score = new int[10];
//		float[] score = new float[10];
		String[] score = new String[10];
		//초기화 아직 안했습니다.
		//치과는 new 타입[] {} 형식
		
		//기본타입은 초기화를 안하면 0에 가까운 값으로 자동 초기화
		
		
		// 혹시 이 상태에서 배열의 내용을 출력해보면
		for (int i = 0; i < score.length; i++) {
			System.out.println(
					"[" + i +  "]=" + score[i]);

		}

	}
}
