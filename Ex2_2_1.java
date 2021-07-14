
public class Ex2_2_1 {

	public static void main(String[] args) {

		int number = MyConsole.readInt("give me a number and i will tell u if it is a perfect or not ");
		System.out.println(isPerfect(number));

	}

	public static boolean isPerfect(int n) {

		if (n <= 1) {
			// System.exit(-1);
			return false;
		}

		int sum = 1;

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				if (i * i != n)
					sum = sum + i + n / i;
				else
					sum = sum + i;
			}
		}

		if (sum == n && n != 1)
			return true;

		return false;
	}

}
