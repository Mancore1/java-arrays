package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static telran.arrays.MatricesInt.*;
import static telran.arrays.InterviewTasks.*;

class MatricesTest {

	@Test
	void multiplyConstantTest() {
		int[][] src = { { 1, 10, 20 }, { 30, -10, 15 } };
		int[][] expected = { { 2, 20, 40 }, { 60, -20, 30 } };
		assertArrayEquals(expected, multiplyConstant(src, 2));
	}

	@Test
	void getColumtTest() {
		int[][] src = { { 1, 10, 20 }, { 30, -10, 15 } };
		int[] expected = { 1, 30 };
		assertArrayEquals(expected, getColumn(src, 0));

	}

	@Test
	void transpMatrixTest() {
		int[][] src = { { 1, 10, 20 }, { 30, -10, 15 } };
		int[][] expected = { { 1, 30 }, { 10, -10 }, { 20, 15 } };
		assertArrayEquals(expected, transpMatrix(src));
	}

	@Test
	void getMaxWithNegativeTest() {
		short[] array = { 1, 1, 1, -1, 20, 100, 200, 100, -100, -100, -20, -40, 80 };
		short[] array1 = { -40, 1, -40, -6, 2, 3, 40 };
		short[] array2 = { 40, 1, 2, 3, 40, -30 };
		assertEquals(100, getMaxWithNegativePresentation(array));
		assertEquals(40, getMaxWithNegativePresentation(array1));
		assertEquals(-1, getMaxWithNegativePresentation(array2));
	}
}
