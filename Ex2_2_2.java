
import java.util.Arrays;

public class Ex2_2_2 {

	public static int[] perfectNumbers(int num) {

		if (num <= 1) {
			// System.exit(-1);
			int[] a = {};
			return a;
		}

		int amount = 2 * (int) Math.sqrt(num) + 1;

		int perfNums[] = new int[amount];

		int count = 0;

		for (int i = 2; i <= num; i++) {
			if (isPerfect(i)) {
				perfNums[count++] = i;
			}
		}
		int[] perfectArrays = new int[count];
		for (int i = 0; i < perfectArrays.length; i++) {
			perfectArrays[i] = perfNums[i];

		}
		return perfectArrays;

	}

	public static boolean isPerfect(int n) {

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

	public static void main(String[] args) {
		int n = MyConsole.readInt("give me a number to check for perfect numbers ");
		System.out.println(Arrays.toString(perfectNumbers(n)));
	}

}
