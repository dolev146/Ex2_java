
public class Ex2_4_2 {

	public static void main(String[] args) {
		int dec = MyConsole.readInt("give me a decimal number ");
		String hex = dec2Hex(dec);
		System.out.println(hex);

	}

	public static String GetValueOfDigit(int num) {
		String value = "";
		switch (num) {
		case 0:
			// code block
			value = "0";
			break;
		case 1:
			// code block
			value = "1";
			break;
		case 2:
			// code block
			value = "2";
			break;
		case 3:
			// code block
			value = "3";
			break;
		case 4:
			// code block
			value = "4";
			break;
		case 5:
			// code block
			value = "5";
			break;
		case 6:
			// code block
			value = "6";
			break;
		case 7:
			// code block
			value = "7";
			break;
		case 8:
			// code block
			value = "8";
			break;
		case 9:
			// code block
			value = "9";
			break;
		case 10:
			// code block
			value = "A";
			break;
		case 11:
			// code block
			value = "B";
			break;
		case 12:
			// code block
			value = "C";
			break;
		case 13:
			// code block
			value = "D";
			break;
		case 14:
			// code block
			value = "E";
			break;
		case 15:
			// code block
			value = "F";
			break;

		case 16:
			// code block
			value = "10";
			break;

		default:
			// code block
		}
		return value;

	}

	public static String dec2Hex(int num) {
		// 4387256
		// 42F1B8

		if (num < 0) {
			return "-1";
		}

		if (num == 0) {
			return "0";
		}

		int temp = num;
		int size = 0;
		while (temp != 0) {
			size++;
			temp = temp / 16;
		}

		int[] moduloArray = new int[size];

		for (int i = 0; i < moduloArray.length; i++) {
			moduloArray[i] = num % 16;
			num = num / 16;
		}
		String outPut = "";
		for (int i = 0; i < moduloArray.length; i++) {
			outPut = GetValueOfDigit(moduloArray[i]) + outPut;
		}

		return outPut;

//		int digit = num % 16;
//		String str = GetValueOfDigit(digit);
//
//		num = num / 16;
//		return dec2Hex(num) + str;

	}

}
