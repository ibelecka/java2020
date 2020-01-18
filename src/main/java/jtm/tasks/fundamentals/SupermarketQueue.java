package jtm.tasks.fundamentals;

import jtm.activity03.Array;

import java.util.Arrays;

public class SupermarketQueue {

	/*
	 * TODO There is a queue for the self-checkout tills at the supermarket. Your
	 * task is write a function to calculate the total time required for all the
	 * customers to check out!
	 * 
	 * Input: customers: an array of positive integers representing the queue. Each
	 * integer represents a customer, and its value is the amount of time they
	 * require to check out. n: a positive integer, the number of checkout tills.
	 * Output The function should return an integer, the total time required.
	 * 
	 * Examples: queueTime([5,3,4], 1) => should return 12 Because when there is 1
	 * till, the total time is just the sum of the times
	 * 
	 * queueTime([10,2,3,3], 2) => should return 10 Because here n=2 and the 2nd,
	 * 3rd, and 4th people in the queue finish before the 1st person has finished.
	 * 
	 * queueTime([2,3,10], 2) => should return 12
	 * 
	 */

//	public static void main(String[] args) {
//		int[] arr = { 2, 5, 4, 7, 10 };
//		int a = solveSuperMarketQueue(arr, 2);
//		System.out.println("time" + a);
//
//	}

	public static int solveSuperMarketQueue(int[] customers, int n) {
		int sumTime = 0;
		int[] arrTill = new int[n];
		int num = -1;
		int num2 = 0;
		if (n == 1) {
			for (int i = 0; i < customers.length; i++) {
				sumTime += customers[i];
			}
		} else {
			for (int i = 0; i < customers.length; i++) {
				if (i < n) {
					arrTill[i] = customers[i];
				} else {
					if (num < n - 1) {
						num++;
					} else {
						num = 0;
					}
					if (n - num == 1) {
						num2 = 0;
					} else {
						num2 = num + 1;
					}
					if (arrTill[num] < arrTill[num2]) {
						arrTill[num] += customers[i];
					} else {
						arrTill[num2] += customers[i];
					}

				}

			}
			sumTime = arrTill[0];
			for (num = 0; num < n; num++) {

				if (arrTill[num] > sumTime) {
					sumTime = arrTill[num];
				}
			}
		}
		return sumTime;
	}

}
