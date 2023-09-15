package 연습문제;

import java.util.Scanner;

public class 사측연산 {

	public static void main(String[] args) {
		System.out.println("OTL");
	     // 키보드로부터 두수를 입력받는 함수호출
        int[] number = inputNumber();
        System.out.println("0번째 값: " + number[0]);
        System.out.println("1번째 값: " + number[1]);
        
        // 메소드 산술연산결과를 설명하는 기호상수 정의(=선언)
        final int 사칙연산의_수 = 4;
        final int 더하기_연산_결과 = 0;
        final int 빼기_연산_결과 = 1;
        final int 곱하기_연산_결과 = 2;
        final int 나누기_연산_결과 = 3;
        
        // 입력받은 두수를 이용하여 사칙연산 실행
        int[] resultNumber = new int[사칙연산의_수];
        resultNumber[더하기_연산_결과] = add(number[0], number[1]);
        resultNumber[빼기_연산_결과] = sub(number[0], number[1]);
        resultNumber[곱하기_연산_결과] = mul(number[0], number[1]);
        resultNumber[나누기_연산_결과] = div(number[0], number[1]);
        
        // 화면에 출력하는 뷰
        // 메세지를 한꺼번에 출력하겠습니다.
        public static String makeCalcResultString(int[] number,int[] resultNumber)
        { //메소드 본체 완성
        String msg = """
        	$x + $y = $resultAdd
        	$x - $y = $resultSub
        	$x x $y = $resultMul
        	$x / $y = $resultDiv
        		
        	""";            
        msg = msg.replace("$x", "" + number[0])
           .replace("$y", "" + number[1])
           .replace("$resultAdd", "" + resultNumber[더하기_연산_결과])
        .replace("$resultSub", "" + resultNumber[더하기_연산_결과])
        .replace("$resultMul", "" + resultNumber[더하기_연산_결과])
        .replace("$resultDiv", "" + resultNumber[더하기_연산_결과]);
        return msg; // 문자열을 함수외부로 리턴
	}
        
        System.out.println( msg );
        
    
    } // main end

	public static int[] inputNumber() {
	    // 배열을 이용해서 변수를 두개만들었습니다.
		int[] number = new int[2];

		Scanner scanner = new Scanner(
System.in
);
		System.out.print("첫번째 정수를 입력해주세요 😃 ");
		number[0] = scanner.nextInt();
		System.out.print("두번째 정수를 입력해주세요 😃 ");
		number[1] = scanner.nextInt();

		// 배열명은 힙에 저장되어 있는 참조데이터를 가르키는 주소(포인터)입니다,.
		return number;

	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static int sub(int x, int y) {
		return x - y;
	}

	public static int mul(int x, int y) {
		return x * y;
	}

	public static int div(int x, int y) {
       return x / y;
 
    }
} 