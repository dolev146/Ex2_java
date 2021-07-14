
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ex2_2Test {

	@Test
	void testPerfectNumbers1() {
		int[] num = Ex2_2_2.perfectNumbers(10);
		int[] value = { 6 };
		Assertions.assertArrayEquals(value, num);
	}

	@Test
	void testPerfectNumbers2() {
		int[] num = Ex2_2_2.perfectNumbers(-10);
		int[] value = {};
		Assertions.assertArrayEquals(value, num);
	}

	@Test
	void testPerfectNumbers3() {
		int[] num = Ex2_2_2.perfectNumbers(0);
		int[] value = {};
		Assertions.assertArrayEquals(value, num);
	}

	@Test
	void testPerfectNumbers4() {
		int[] num = Ex2_2_2.perfectNumbers(500);
		int[] value = { 6, 28, 496 };
		Assertions.assertArrayEquals(value, num);
	}

	@Test
	void testPerfectNumbers5() {
		int[] num = Ex2_2_2.perfectNumbers(50000);
		int[] value = { 6, 28, 496, 8128 };
		Assertions.assertArrayEquals(value, num);
	}
	// ***************************************************

	@Test
	void test1() {
		boolean num = Ex2_2_1.isPerfect(6);
		boolean value = true;
		Assertions.assertEquals(value, num);
	}

	@Test
	void test2() {
		boolean num = Ex2_2_1.isPerfect(28);
		boolean value = true;
		Assertions.assertEquals(value, num);
	}

	@Test
	void test3() {
		boolean num = Ex2_2_1.isPerfect(-1);
		boolean value = false;
		Assertions.assertEquals(value, num);
	}

	@Test
	void test4() {
		boolean num = Ex2_2_1.isPerfect(21);
		boolean value = false;
		Assertions.assertEquals(value, num);
	}

	@Test
	void test5() {
		boolean num = Ex2_2_1.isPerfect(100);
		boolean value = false;
		Assertions.assertEquals(value, num);
	}
}
