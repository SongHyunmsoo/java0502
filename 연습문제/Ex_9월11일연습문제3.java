package 연습문제;

import java.time.LocalDateTime;

public class Ex_9월11일연습문제3 {

	public static void main(String[] args) {
//연습문제 3. 다중 if ~ else if 또는 switch 이해하고 있을까요 ? >_<
// 1)  오늘 날짜를 얻어서  현재 월을 구하시요
// 2)    현재 월이 
// 3월, 4월, 5월인 경우  현재 월 + "은 봄입니다." 
// 6월, 7월, 8월인 경우  현재 월 + "은 여름입니다." 
// 9월, 10월, 11월인 경우 현재 월 + "은 가을입니다."
// 12월, 1월, 2월인 경우 현재 월 + "은 겨울입니다."
// 출력하세요

		// 사계을 상수이름으로 식별하기 쉽게 만든다.

		final int SEASON_SPRING = 0;
		final int SEASON_SUMMER = 1;
		final int SEASON_FALL = 2;
		final int SEASON_WINTER = 3;

		// 사계절 이름을 배열로 선언및 초기화
		// seasons 배열변수 현재 만들어지면서
		// "봄"/"여름"/"가을"/"겨울"의 합을
		// 바로 가리키고 있다.
		String[] seasons = new String[] { "봄", "여름", "가을", "겨울" };
		// 이 가리키는 것을 중지시킨다.(가비지 컬렉터가 작동)
		seasons = null;
		// 영어로 출력을 원해서 새로운 힙창고에
		// 새로운 (new) String[4]크기의 스트링배열을 만들ㄴ다.
		// 데이터는 "Spring/summer/Fall/Winter"로 초기화를 한다.
		// { }안의 초기화 데이터로 배열의 크기를 알수있다.
		seasons = new String[] { "Spring", "Summer", "Fall", "Winter" };
		// 오늘의 날짜와 시간을 구합니다.
		// LocalDateTime이라는 라이브러리가 필요
		// 오늘 날짜는 LocalDateTime.now()메소드로 구할 수있다.
		LocalDateTime today = LocalDateTime.now();
		// 이번달을 얻어볼까요 LocalDateTime.getMonthValue()
		int month = today.getMonthValue();

		// 자바 17부터 적극적으로 권장하는 문자열 표기법
		// 프론트언어에서는 템플릿 문자열이라고 부르는
		// Multi-Line String
		// 대표적 사용예
		// 멀티라인 문자열은 """시작"""로 닫습니다.
 String msg = """
 		%s월은(는) %s입니다.
 		""";
 	// 달을 이용하여 계절을 판별합시다.
 	//3<= month : 봄 = seasons[SEASON_SPRING]
 		//월에 따라 출력 메세지를 만듭니다.D
 		if (3<=month&&month<=5) {
 			msg = msg.formatted(
 					 month,seasons[SEASON_SPRING]);
 		}else if (6<= month&&month<= 8) {
 			msg = msg.formatted(month,seasons[SEASON_SUMMER]);
 		}else if (9<= month&&month<= 11 ) {
 			msg = msg.formatted(month,seasons[SEASON_FALL]);
 		}else if (12<= month&&month<= 2) {
 			msg = msg.formatted(month,seasons[SEASON_WINTER]);
 		}
 
 
 
		 
 			System.out.println(msg);
// 3) 현재 날짜는 LocalDateTime클래스를 참조하세요.
// import java.util.LocalDateTime;
//   ...	
//   현재 날짜는 다음으로 
// LocalDateTime now = 
//	LocalDateTime.now
//	();  
//현재월은 다음 메소드로 구합니다.
// int month = now.getMonthValue(); 

	}

}
