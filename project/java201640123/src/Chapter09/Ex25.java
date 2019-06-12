package Chapter09;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int[] data = new int[6];

		System.out.println("** 로또 추첨을 시작합니다. **\n");

		for (i = 0; i < data.length; i++) {
			data[i] = rotto();
		}

		for (i = 0; i < data.length; i++) {
			for (j = data.length - 1; j >= 0; j--) {
				if (data[j] == data[i]) {
					data[i] = rotto();
				}
			}
		}

		System.out.print("추첨된 로또 번호 ==>  ");

		for (i = 0; i < data.length; i++) {
			System.out.printf("%d ", data[i]);
		}
	}

	static int rotto() {
		int r = (int) (Math.random() * 45 + 1);
		return r;
	}
}
