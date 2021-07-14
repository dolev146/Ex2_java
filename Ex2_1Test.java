
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ex2_1Test {

	@Test
	void test1() {
		int[] arr = Ex2_1.primeDividers(-10);
		int[] arr2 = {};
		Assertions.assertArrayEquals(arr2, arr);
	}

	@Test
	void test2() {
		int[] arr = Ex2_1.primeDividers(351);
		int[] arr2 = { 3, 3, 3, 13 };
		Assertions.assertArrayEquals(arr2, arr);
	}

	@Test
	void test3() {
		int[] arr = Ex2_1.primeDividers(315);
		int[] arr2 = { 3, 3, 5, 7 };
		Assertions.assertArrayEquals(arr2, arr);
	}

	@Test
	void test4() {
		int[] arr = Ex2_1.primeDividers(8);
		int[] arr2 = { 2, 2, 2 };
		Assertions.assertArrayEquals(arr2, arr);
	}

	@Test
	void test5() {
		int[] arr = Ex2_1.primeDividers(359);
		int[] arr2 = { 359 };
		Assertions.assertArrayEquals(arr2, arr);
	}

}
