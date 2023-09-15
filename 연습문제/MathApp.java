package 연습문제;

public class MathApp {

	public static void main(String[] args) {
		//Math객체를 생성하고 작업
		//익숙해지기 위해 Math Object
		//MathObj객체 선언
		//01클레스,객체 = 생성 클레스
		Math01 mathObj  = new Math01();
		//덧셈객체 mathObj 메소드 실행 결과
		
		int addResult = mathObj.add(2,3);
		//밸셈객체 mathObj 메소드 실행 결과
		System.out.println(
				"2와3의 합은"+ addResult+"입니다");
		int subResult = mathObj.sub(100,50);
		System.out.println(
				"100와50의 뺸값은"+ subResult+"입니다");
		//곱셈객체 mathObj 메소드 실행 결과
		int mulResult = mathObj.mul(10,20);
		System.out.println(
				"10와20의 곱은"+ mulResult+"입니다");
		//나누샘객체 mathObj 메소드 실행 결과
		int divResult = mathObj.div(100,50);
		System.out.println(
				"100와50의 나눈값은"+ divResult+"입니다");
		//나머지구하기 객체
		int modResult = mathObj.mod(15,100);
		System.out.println(
				"15와100의 나머지값"+ modResult+"입니다");

	}

}
