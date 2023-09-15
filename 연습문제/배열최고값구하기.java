package 연습문제;

public class 배열최고값구하기 {

	public static void main(String[] args) {
		int max = -1;
		int min = 101;
		int[] array = { 1, 5, 3, 8, 2 };
		for (int i = 0; i < array.length; i++) {
			if (max <= array[i]) {
				max = array[i];

			}

		}
		for (int i = 0; i < array.length; i++) {
			if (min < array[i]) {
				min = array[i];

			}
			System.out.println(max);

		}
	}
}
