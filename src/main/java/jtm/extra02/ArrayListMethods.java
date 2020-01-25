package jtm.extra02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
	List<Integer> myList = new ArrayList<Integer>();

	public List<Integer> checkArray(int comparator, int... numbers) {
		// TODO #1:Implement method that compares values of passed array with
		// passed comparator.
		// Return list with values that are smaller than comparator.
		// Hint: Investigate how varargs are used.

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < comparator) {
				myList.add(numbers[i]);
			}
		}
		return myList;
	}

	public int sumResult() {
		// TODO #2: Count element sum of the list

		int sum = 0;
		for (int i = 0; i < myList.size(); i++) {
			sum += myList.get(i);
		}

		return sum;

	}
}
