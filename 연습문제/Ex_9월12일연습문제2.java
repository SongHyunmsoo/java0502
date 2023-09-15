package 연습문제;

public class Ex_9월12일연습문제2 {

	public static void main(String[] args) {
		//scanner sc = new scanner(System.in);
		
		// 문제1
		// 학생 5명이 있습니다.
		// {"홍길동","홍이동","홍삼동","홍사동","홍오동"}
		// 이학생들의 성적을 관리하는 프로그램을 만들려고 합니다.
		// 학생의 리스트를 대표변수를 이용하여 학생의 이름을 출력하세요

		// 문제2
		// 각학생의 국어점수는 다음과 같습니다.
		// 홍길동 : 90점
		// 홍이동 : 85점
		// 홍삼동 : 93점
		// 홍사동 : 95점
		// 홍오동 : 87점
		// 국어과목의 총점을 구하고 평균점을 구하시오
		// 가장 높은 국어점수와 가장 낮은 국어점수를 구하시오
		// 가장 높은 국어점수를 기록한 학생이름은 누구입니까?
		String[] studentName = new String[5]; // 배열의 선언

		studentName = new String[] { "홍길동", "홍이동", "홍삼동", "홍사동", "홍오동" };
		int[] korScore;
		korScore = new int[] {90,85,93,95,87};
		//				int는: int타입배열
		int total = 0;
		int avg = 0;
		int maxScore = -1; //-1로 두는 이유는 0점이 나올수있기에 점수에서는 -1이 존재하지 않기 때문에 아직 비교하기전
		int maxIndex = -1; //-1로 두는 이유는 0점이 나올수있기에 점수에서는 -1이 존재하지 않기 때문에 아직 비교하기전
		int minScore = 101; //101로 두는 이유는 0점이 나올수있기에 점수에서는 -1이 존재하지 않기 때문에 아직 비교하기전
		int minIndex = 101; //101로 두는 이유는 0점이 나올수있기에 점수에서는 -1이 존재하지 않기 때문에 아직 비교하기전
		for (int i = 0; i < 5; i++) {
			System.out.println(studentName[i]);
			total = total+ korScore[i];
			avg = total/korScore.length;
		if(maxScore<korScore[i]) {
			maxScore=korScore[i];
			maxIndex=i;
			}
		if(minScore>korScore[i]) {
			minScore=korScore[i];
			minIndex=i;
		}
			
		}
		String msg ="""
				총점 : $total
				평균 : $avg
				최고점수 :  $maxScore
				최고점수 학생 : $maxStudent
				최저점수 : $minScore
				최저점수 학생 : $minStudent
				""";
		msg = msg.replace("$total", "" +total)
				.replace("$avg", "" + avg)
				.replace("$maxScore", "" + maxScore)
				.replace("$maxStudent", "" + studentName[maxIndex])
				.replace("$minScore", "" + minScore)
				.replace("$minStudent", "" + studentName[minIndex]);
		System.out.println(msg);
		msg = msg.replace("$total",""+total);
				
		System.out.println("평균:"+avg);
		System.out.println("총점"+total);
		System.out.println("최대점수"+maxScore);
		System.out.println("최소점수"+minScore);
		System.out.println("indexmax"+maxIndex);
		System.out.println("indexmin"+minIndex);
	}

}
