package jtm.tasks.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLeaders {

    /*
        TODO
        Given an array/list [] of integers , Find all the LEADERS in the array.
        An element is leader if it is greater than The Sum all the elements to its right side.

        Array size is at least 3 .
        Array numbers Will be mixture of positives , negatives and zeros
        Repetition of numbers in the array could occur.
        Returned Array should store the leading numbers in the same order in the original array.
     */
    public static int[] arrayLeaders(int[] numbers) {
		int sum = 0;
		ArrayList<Integer> leadersList = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				sum += numbers[j];
			}
			if (numbers[i] > sum) {
				System.out.println("number " + numbers[i] + " sum: " + sum);
				leadersList.add(numbers[i]);

				System.out.println(leadersList);
			}
			sum = 0;
		}
		int[] leaders = new int[leadersList.size()];
		for (int i = 0; i < leadersList.size(); i++) {
			leaders[i] = leadersList.get(i);
		}

		return leaders;
    }
}
