package jtm.tasks.fundamentals;

public class EqualSidesArray {

    /* TODO

        You are going to be given an array of integers. Your job is to take that array and find an index N where
        the sum of the integers to the left of N is equal to the sum of the integers to the right of N. If there is
        no index that would make this happen, return -1.

        {1,2,3,4,3,2,1}: Correct answer 3, because at the 3rd position of the array,
        the sum of left side of the index ({1,2,3}) and the sum of the right side of the index ({3,2,1}) both equal 6.

        {1,100,50,-51,1,1}: Correct answer 1, because at the 1st position of the array,
        the sum of left side of the index ({1}) and the sum of the right side of the index ({50,-51,1,1}) both equal 1.

        {20,10,-80,10,10,15,35} At index 0 the left side is {} The right side is {10,-80,10,10,15,35}
        They both are equal to 0 when added. (Empty arrays are equal to 0 in this problem)
        Index 0 is the place where the left side and right side are equal.

        If you are given an array with multiple answers, return the lowest correct index.
     */

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
