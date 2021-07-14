
import java.math.BigInteger;

public class Ex2_4_1 {

	public static void main(String[] args) {
		String hex = MyConsole.readString("give me a hexadeciaml number ");
		int dec = hex2Dec(hex);
		System.out.println(dec);

	}

	public static int convertOneLetterToInt(char letter) {
		int value = 0;
		switch (Character.toString(letter)) {
		case "0":
			// code block
			value = 0;
			break;
		case "1":
			// code block
			value = 1;
			break;
		case "2":
			// code block
			value = 2;
			break;
		case "3":
			// code block
			value = 3;
			break;
		case "4":
			// code block
			value = 4;
			break;
		case "5":
			// code block
			value = 5;
			break;
		case "6":
			// code block
			value = 6;
			break;
		case "7":
			// code block
			value = 7;
			break;
		case "8":
			// code block
			value = 8;
			break;
		case "9":
			// code block
			value = 9;
			break;
		case "A":
			// code block
			value = 10;
			break;
		case "B":
			// code block
			value = 11;
			break;
		case "C":
			// code block
			value = 12;
			break;
		case "D":
			// code block
			value = 13;
			break;
		case "E":
			// code block
			value = 14;
			break;
		case "F":
			// code block
			value = 15;
			break;

		case "10":
			// code block
			value = 16;
			break;

		default:
			value = -1;
			// code block

		}
		return value;

	}

	public static int power(int base, int exponent) {
		int sum = 1;
		for (int i = 0; i < exponent; i++) {
			sum *= base;
		}
		return sum;

	}

	public static int hex2Dec(String hex) {
		// 4387256
		// 42F1B8

		if (hex == null || hex == "") {
			return -1;
		}

		int dec = 0;

		int counter = 1;

		for (int i = 0; i < hex.length(); i++) {
			char num = hex.charAt(i);
			int decimal = convertOneLetterToInt(num);
			if (decimal == -1) {
				return -1;
			}
			int exponent = hex.length() - counter++;
			dec += decimal * power(16, exponent);
		}
		long bi = new BigInteger(hex, 16).longValue();
		if (Long.parseLong(hex, 16) > 2147483647) {
			return -1;
		}

		return dec;

	}

}
