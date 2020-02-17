package jtm.extra14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
	 * "TTT"}
	 * 
	 * When finished sort them alphabetically.
	 */

	public static String[] coinFlip(int n) {
		int numComb = 1;
		int headCount = 0;
		int tailCount = 0;
//    	List<String> combos = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			numComb = numComb * 2;
		}
		String[] combos = new String[numComb];

		for (int i = 0; i < numComb; i++) {
			combos[i] = "";
		}

		for (int i = 0; i < n; i++) {
			headCount = 0;
			tailCount = 0;
			int d = 1;
			for (int x = 0; x < i; x++) {
				d = d * 2;
			}
			for (int j = 0; j < combos.length; j++) {
				for (int c = 0; c < d; c++) {
					if (headCount < numComb / 2) {
						combos[j] += "H";
						headCount++;
					} else if (tailCount < 2) {
						tailCount++;
						combos[j] += "T";
					}
				}
			}
		}

		System.out.println(Arrays.toString(combos));
		return null;
	}

	public static void main(String[] args) {
		// Expected "HH", "HT", "TH", "TT"
		String[] res = CoinFlip.coinFlip(3);
		System.out.println(res);
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
