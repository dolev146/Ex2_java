
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ex2_4Test {

	@Test
	void testDec2Hex() {
		int num = Ex2_4_1.hex2Dec("");
		int value = -1;
		Assertions.assertEquals(value, num);
	}

	@Test
	void testDec2Hex2() {
		int num = Ex2_4_1.hex2Dec(null);
		int value = -1;
		Assertions.assertEquals(value, num);
	}

	@Test
	void testDec2Hex3() {
		int num = Ex2_4_1.hex2Dec("0");
		int value = 0;
		Assertions.assertEquals(value, num);
	}

	@Test
	void testDec2Hex4() {
		int num = Ex2_4_1.hex2Dec("NJLKNK#4243");
		int value = -1;
		Assertions.assertEquals(value, num);
	}

	@Test
	void testDec2Hex5() {
		long num = Ex2_4_1.hex2Dec("7FFFFFFFFFFFFFFF");
		int value = -1;
		Assertions.assertEquals(value, num);
	}

	// *******************************************************************

	@Test
	void test1() {
		String num = Ex2_4_2.dec2Hex(2147483647);
		String value = "7FFFFFFF";
		Assertions.assertEquals(value, num);
	}

	@Test
	void test2() {
		String num = Ex2_4_2.dec2Hex(-516);
		String value = "-1";
		Assertions.assertEquals(value, num);
	}

	@Test
	void test3() {
		String num = Ex2_4_2.dec2Hex(0);
		String value = "0";
		Assertions.assertEquals(value, num);
	}

	@Test
	void test4() {
		String num = Ex2_4_2.dec2Hex(15432);
		String value = "3C48";
		Assertions.assertEquals(value, num);
	}

	@Test
	void test5() {
		String num = Ex2_4_2.dec2Hex(1219864);
		String value = "129D18";
		Assertions.assertEquals(value, num);
	}

}
