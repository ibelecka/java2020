package jtm.extra03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPractical {

	public TestPractical() {
		// TODO Auto-generated constructor stub
	}

	public String getPracticalNumbers(int from, int to) {
		return "";
	}

	
	public static void main(String[] args) {
		int firstNum = 527;
		int lastNum = 545;
		String message = "[";
		
		for (int num = firstNum; num <= lastNum; num++) {
			System.out.println(message);
			boolean status = false;
			int[] arrNum = new int[num - 1];
			boolean found = true;
			List<Integer> arr = new ArrayList<Integer>();
			int practSum = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {

					arr.add(i);
//					System.out.println(i);
					practSum += i;
//					System.out.println(i + " " + practSum);

				}
			}
//			System.out.println("num = " + num + "  2 * num = " + 2 * num + "; 1 + pract sum = " + (1+practSum) + " divisors " + arr);
//			System.out.println("num = " + num + "  ; 1 + pract sum = " + (practSum) + " divisors " + arr);		
			int sum = arr.get(0);
			for (int i = 1; i < arr.size() - 1; i++) {
				if (sum < arr.get(i) - 1) {
					status = false;
					break;
				} else {
					status = true;
					sum += arr.get(i);
				}

			}
			if (status == true) {
				message += num ;
				if (num == lastNum ) {
				message += "]";
			} else {
				message += ", ";
			}
				System.out.println(num + " ololo ");
			}
			
//			if (num = lastNum ) {
//				message.replace(', newChar) +=" , ";
//			}

//			if (2*num <= 1+practSum ) {
//				message += num + " ";
//				System.out.println(num + " ololo ");
//			}

		}
		if (message.endsWith(", ")) {
//			message.replace(",", " ");
			message = message.substring(1,message.length() - 2);
			message +="]";
		}
		
		System.out.println(message);
		
//		System.out.println("sum = " + (1 + 2+ 3 + 6+ 89+ 178+ 267+ 534));
	}

}
