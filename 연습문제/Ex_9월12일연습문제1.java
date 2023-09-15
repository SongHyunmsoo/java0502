package 연습문제;

public class Ex_9월12일연습문제1 {

	public static void main(String[] args) {
		// 문제1
		// 학생 5명이 있습니다.
		// {"홍길동","홍이동","홍삼동","홍사동","홍오동"}
		// 이학생들의 성적을 관리하는 프로그램을 만들려고 합니다.
		// 학생의 리스트를 대표변수를 이용하여 학생의 이름을 출력하세요
		String[] studentName = new String[5]; // 배열의 선언
		studentName = new String[] { "홍길동", "홍이동", "홍삼동", "홍사동", "홍오동" };
		for(int i=0; i<5;i++) {
			System.out.println(studentName[i]);
		}
	
	}

}
