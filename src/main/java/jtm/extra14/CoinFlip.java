package jtm.extra14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CoinFlip {

	/*
	 * You will be given an integer n, which is the number of times that is thown a
	 * coin. Return an array of string for all the possibilities (heads[H] and
	 * tails[T]). Examples:
	 * 
	 * coin(1) should return {"H", "T"} coin(2) should return {"HH", "HT", "TH",
	 * "TT"} coin(3) should return {"HHH", "HHT", "HTH", "HTT", "THH", "THT", "TTH",
	 * "TTT"} [ TTH, , THT, TTT]
	 * 
	 * When finished sort them alphabetically.
	 */

	public static String[] coinFlip(int n) {
		String s = "";
		int count = (int) Math.pow(2, n);
		String[] combos = new String[count];
		String[] init = { "H", "T" };
		combos[0] = init[0];
		combos[1] = init[1];
		for (int i = 2; i <= n; i++) {
			count = (int) Math.pow(2, i);
			for (int k = count - 1; k >= count / 2; k--) {
				System.out.println("i = " + i + " j = " + " k = " + k);
				s = "";
				if (combos[k - count / 2] == null || combos[k - count / 2].isEmpty()) {
					s = init[1];
				} else {
					s = combos[k - count / 2] + init[1];
				}
				combos[k] = s;
				System.out.println("i = " + i + " j = " + " k = " + k + " comb = " + combos[k]);
			}

			for (int k = count / 2 - 1; k >= 0; k--) {
				s = "";
				if (combos[k] == null || combos[k].isEmpty()) {
					s = init[0];
				} else {
					s = combos[k] + init[0];
				}
				combos[k] = s;
				System.out.println("i = " + i + " j = " + " k = " + k + " comb = " + combos[k]);
			}
		}
		Arrays.sort(combos);
		return combos;
	}

	public static void main(String[] args) {
		// Expected "HH", "HT", "TH", "TT"
		String[] res = CoinFlip.coinFlip(3);
		System.out.println(Arrays.toString(res));
	}

	/*
	 * Hint:
	 * 
	 * It's generally easier to work with lists than arrays, even if requirement is
	 * to return array
	 * 
	 * Snippet how to go from List<String> to String[]
	 * 
	 * 
	 * List<String> combos = new ArrayList<>(); String[] res = combos.toArray(new
	 * String[0]);
	 * 
	 */

}
