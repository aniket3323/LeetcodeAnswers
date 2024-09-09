package com.leet.twoSum_01;

public class TwoSumMain {

	public static void main(String[] args) {
		int []nums = {2,7,11,15};
		int target = 9;
		TwoSum ts = new TwoSum();
		 int[] result = ts.twoSum(nums, target);
		 
		 if (result != null) {
	            System.out.println("[" + result[0] + ", " + result[1] + "]");
	        } else {
	            System.out.println("No solution found.");
	        }

	}
}
