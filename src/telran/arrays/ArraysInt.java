package telran.arrays;

import java.util.Arrays;

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
	//TODO returns array with no number at the given index;
	return null;
}
public static int[] insertNumberSorted(int[] arraySorted, int number) {
	//TODO takes sorted array and number to insert
	//returns sorted array with the given number at a proper position
	//apply the standart method of the class Arrays int binarySearch(int array, int key)
	return null;
}
}
