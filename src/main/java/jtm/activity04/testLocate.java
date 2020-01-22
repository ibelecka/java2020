package jtm.activity04;

public class testLocate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 3, 2, 1 };
		int a = findEvenIndex(arr);
		System.out.println(a);

	}

	public static int findEvenIndex(int[] arr) {
	int sum1 = 0;
	int sum2 = 0;
	int i;
	int j;
	for (j = 0; j<arr.length; j++)
	{	
		for ( i = 0; i < j; i++) {
			sum1 += arr[i];
		}
		System.out.println("sum1 = " + sum1);
				
		for (i = j+1; i < arr.length; i++) {
			sum2 += arr[i];
	  
	    }
		System.out.println("sum2 = " + sum2);
		if (sum1==sum2) {
			return j;
		} else {
			sum1 = 0;
			sum2 = 0;
		}
	}

	return -1;
	}

	}