package telran.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysInt {
	public static int[] addNumber(int[] array, int number) {
		int[] result = Arrays.copyOf(array, array.length + 1);
		result[array.length] = number;
		return result;
	}

	public static int[] insertNumber(int[] array, int index, int number) {
		int[] res = new int[array.length + 1];
		System.arraycopy(array, 0, res, 0, index);
		res[index] = number;
		System.arraycopy(array, index, res, index + 1, array.length - index);
		return res;
	}

	public static int[] removeNumber(int[] array, int index) {
		int[] res = new int[array.length - 1];
		System.arraycopy(array, 0, res, 0, index);
		System.arraycopy(array, index + 1, res, index, array.length - index - 1);
		return res;
	}

	public static int[] insertNumberSorted(int[] arraySorted, int number) {
		int index = Arrays.binarySearch(arraySorted, number);

		if (index < 0) {
			index = -(index + 1);
		}

		return insertNumber(arraySorted, index, number);

		// takes sorted array and number to insert
		// returns sorted array with the given number at a proper position
		// apply the standart method of the class Arrays int binarySearch(int array, int
		// key)
	}

	public static int searchNumber(int[] array, int number) {
		int index = 0;
		while (index < array.length && array[index] != number) {
			index++;
		}
		return index < array.length ? index : -1;
	}

	public static int binarySearchNumber(int[] array, int number) {
		int left = 0;
		int right = array.length - 1;
		int middle = right / 2;
		while (left <= right && array[middle] != number) {
			if (number < array[middle]) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
			middle = (left + right) / 2;
		}
		return left <= right ? middle : -1; // дз на первое вхождение должно быть
	}

	public static void quickSort(int[] array) {
		Arrays.sort(array); // O[N]*LogN
	}

	public static void bubbleSort(int[] array) {
		int length = array.length;
		boolean flSorted = false;
		do {
			length--;
			flSorted = true;
			for (int i = 0; i < length; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
					flSorted = false;
				}
			}
		} while (!flSorted);
	}

	private static void swap(int[] array, int i, int j) {
		// swap with no additional variable;
//		array[i] = array[i] + array[i] + 1;
//		array[i + 1] = array[i] - array[i + 1];
//		array[i] = array[i] - array[i + 1];
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	public static int getRandomInt(int min, int max) {
		Random gen = new Random();
		return gen.nextInt(min, max);
	}

	public static int myBinarySearchNumber(int[] array, int number) {
		int left = 0;
		int right = array.length - 1;
		int index = -1;

		while (left <= right) {
			int middle = (left + right) / 2;

			if (array[middle] == number) {
				index = middle;
				right = middle - 1;
			} else if (number < array[middle]) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}
		return index >= 0 ? index : -(left + 1);
	}
}
