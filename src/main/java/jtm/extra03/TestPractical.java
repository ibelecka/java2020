package jtm.extra03;

import java.util.ArrayList;
import java.util.List;

public class TestPractical {

	public TestPractical() {
		// TODO Auto-generated constructor stub
	}

	public String getPracticalNumbers(int from, int to) {
		return "";
	}

	
	public static void main(String[] args) {
		int num = 12;
	//	int[] arr;
//		int n = 0;
		List<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				arr.add(i);
				
			}
		}
		System.out.println("Number " + num + ", devisors: " + arr);
		
		for (int i = 1; i < num; i++) {
			for (int n = i; n < arr.size()+1; n++)
		}

	}

}
