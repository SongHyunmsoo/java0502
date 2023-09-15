package 연습문제;

public class 깊은복사 {

	public static void main(String[] args) {
		// 원본배열
		int[] list = { 10, 20, 30, 40, 50 };

		// 복사본배열
		// 깊은 복사는
		// 1.공간을 확보해야합니다.
		// 2.복사할 원본과 크기가 같아야 하므로 배열타입 크기만큼
		// new 배열타입[]으로 공간확보가 필요
		// 3.루프를 통하여 원본의 개별요소를 복사본의 개별요소에
		// 저장해주면 됩니다.=
		int[] numbers = new int[list.length];

		// 원본의 갯수만큼 복사를 해주세요
		for (int i = 0; i < list.length; i++) {
			numbers[i] = list[i];
		}

		System.out.println(list.toString());
		System.out.println(numbers.toString());
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);

		}
		for (int i = 0; i < list.length; i++) {
			System.out.println(numbers[i]);
		}
		for (int i = 0; i < list.length; i++)
			numbers[i] = 0;
		{
			for (int i = 0; i < list.length; i++) {
				System.out.println(numbers[i]);
			}
			for (int i = 0; i < list.length; i++) {
				System.out.println(numbers[i]);
			}

		}
	}
}