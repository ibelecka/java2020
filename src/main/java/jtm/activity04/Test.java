package jtm.activity04;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
	
	int[] num = {3, 4, 50, 5, 4};
	
	int ans[];
	ans  =  arrayLeaders(num);
	
	System.out.println("ans " + Arrays.toString(ans));
	
	}
	
	
	

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