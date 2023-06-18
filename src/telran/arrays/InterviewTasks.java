package telran.arrays;

import java.util.Arrays;

public class InterviewTasks {
	public static boolean isSumTwo(short[] array, short sum) {
		boolean[] helper = new boolean[sum > 0 ? sum + 1 : Short.MAX_VALUE + 1];
		boolean res = false;
		int index = 0;
		while (index < array.length && !res) {
			short num = (short) (sum - array[index]); 
			if (num >= 0) {
				if (helper[num]) {
					res = true;
				} else {
					helper[array[index]] = true;
				}
			}
			index++;
		}
		return res;
	}
	public static void sort(short[] array) {
		int[] helper = new int[Short.MAX_VALUE];
		for (int i = 0; i < array.length; i++) {
			helper[array[i]]++;
		}
		int index = 0;
		for (int i = 0; i < helper.length; i++) {
			for (int j = 0; j < helper[i]; j++) {
				array[index++] = (short) i;
			}
		}
		//array of the positive numbers or 0
		//sorting with complexity O[N]
	}
	public static short getMaxWithNegativePresentation(short[] array) {
		//TODO
		short val = -1;
		boolean[] res = new boolean[Short.MAX_VALUE];
		for (int i = 0; i < array.length; i++) {
			short num = array[i];
			if (num < 0 && res[-num]) {
				val = (short) Math.max(val, -num);
			} else if (res[-num]) {
				val = (short) Math.max(val, num);
			}
			res[num] = true;
		}
		//return max positive number having an negative value with the same abs value,
		//if not such numbers returns -1
		return val;
	}
}
