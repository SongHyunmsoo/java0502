package 연습문제;

public class StudentScoreGetExample {

	public static void main(String[] args) {
		String[] studentName = new String[5]; // 배열의 선언
		studentName = new String[]{ "홍길동", "홍이동", "홍삼동", "홍사동", "홍오동" };
		
		int[] korScore = new int[] {90, 85, 93, 95, 87};
	    
		//  -1로 두는 이유는 아직 비교하지 않았습니다란 뜻
		int maxScore = -1; // 가장 높은 점수
		int maxIndex = -1;  // 가장 높은 인덱스
		int minScore = 100;
		int minIndex = -1;
		int total = 0;
		int avg = 0;

		for (int i = 0; i <= 4; i++) {
		    // 총점구하기 
		    total  = total + korScore[i];  

		    // maxScore와 maxIndex구하기  
		    if (maxScore < korScore[i]) {
		        maxScore = korScore[i];
		        maxIndex = i;
		    }  
		    
		    // minScore와 minIndex 구하기
		    if (minScore > korScore[i]) {
		    	minScore = korScore[i];
		    	minIndex = i;
		    }
		}

		System.out.println("총점 : " + total);
		avg = total / korScore.length;
		System.out.println("평균 : " + avg);
		
		// 최고점수 출력
		String msg = """
			총점 : $total
			평균 : $avg
			최고점수 :  $maxScore
			최고점수 학생 : $maxStudent
			최저점수 : $minScore
			최저점수 학생 : $minStudent
			""";	
		
		msg = msg.replace("$total", "" +"100")
		.replace("$avg", "" + avg)
		.replace("$maxScore", "" + maxScore)
		.replace("$maxStudent", "" + studentName[maxIndex])
		.replace("$minScore", "" + minScore)
		.replace("$minStudent", "" + studentName[minIndex]);
		
		System.out.println(msg);
		
		//System.out.println("최고점수 : " + maxScore);
		// 최고점수인 학생 출력
		//System.out.println("최고점수 학생 : " + studentName[maxIndex]);
	}

}
