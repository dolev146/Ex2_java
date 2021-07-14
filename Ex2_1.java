
import java.util.Arrays;

public class Ex2_1 {

	public static boolean isPrime(int num) {

		boolean isPrime = false;
		for (int i = 2; i * i <= num; ++i) {

			if (num % i == 0) {
				isPrime = true;
				break;
			}
		}

		if (!isPrime) {
			return true;
		} else {
			return false;
		}

	}

	public static int[] primeDividers(int n) {

		if (n <= 1) {
			// System.exit(-1);
			int[] a = {};

			return a;
		}

		boolean isPrime = isPrime(n);
		if (isPrime) {
			int[] arr = { n };
			return arr;
		}

		int amountOfPrimes = 0;
		int numberGiven = n;

		while (n % 2 == 0) {

			n /= 2;
			amountOfPrimes++;
		}

		for (int i = 3; i * i <= n; i += 2) {

			while (n % i == 0) {

				n /= i;
				amountOfPrimes++;
			}
		}

		if (n > 2) {

			amountOfPrimes++;
		}

		int[] primeNumbers = new int[amountOfPrimes];

		int index = 0;

		while (numberGiven % 2 == 0) {
			primeNumbers[index] = 2;
			numberGiven /= 2;
			index++;
		}

		for (int i = 3; i <= numberGiven; i += 2) {

			while (numberGiven % i == 0) {
				primeNumbers[index] = i;
				numberGiven /= i;
				index++;
			}
		}

		if (numberGiven > 2) {
			primeNumbers[index] = numberGiven;
		}
		return primeNumbers;

	}

	public static void main(String[] args) {

		int num = MyConsole
				.readInt("give me a positive number greater than 1 and i will tell u the prime numbers that make it ");

		int[] primeArray = primeDividers(num);
		System.out.println(Arrays.toString(primeArray));

	}

}
