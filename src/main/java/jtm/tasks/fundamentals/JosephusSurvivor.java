package jtm.tasks.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class JosephusSurvivor {

	/*
	 * TODO
	 * 
	 * You have to correctly return who is the "survivor", ie: the last element of a
	 * Josephus permutation.
	 * 
	 * Basically you have to assume that n people are put into a circle and that
	 * they are eliminated in steps of k elements, like this:
	 * 
	 * josephus_survivor(7,3) => means 7 people in a circle; one every 3 is
	 * eliminated until one remains [1,2,3,4,5,6,7] - initial sequence [1,2,4,5,6,7]
	 * => 3 is counted out [1,2,4,5,7] => 6 is counted out [1,4,5,7] => 2 is counted
	 * out [1,4,5] => 7 is counted out [1,4] => 5 is counted out [4] => 1 counted
	 * out, 4 is the last element - the survivor! The above link about the "base"
	 * kata description will give you a more thorough insight about the origin of
	 * this kind of permutation, but basically that's all that there is to know to
	 * solve this.
	 * 
	 * You may assume that both n and k will always be >=1.
	 */

	public static int josephusSurvivor(final int n, final int k) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int count = 0;
		int i;
		for (i = 1; i <= n; i++) {
			numbers.add(i);
		}
		i = 0;
		while (numbers.size() != 1) {

			if (count == k) {
				count = 1;
			} else {
				count++;
			}

			if (count == k) {

				numbers.remove(i);
				i--;

			}

			if (i < numbers.size() - 1) {
				i++;
			} else {
				i = 0;
			}

		}

		return numbers.get(0);
	}

	public static void main(String args[]) {
		josephusSurvivor(7, 3);
	}
}
