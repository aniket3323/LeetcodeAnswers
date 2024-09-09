package com.leet.Seach_32;

public class Main {

	public static void main(String[] args) {
		int [] nums =  new int[] {1,3,5,6};
		int target = 4;
		Search ts = new Search();
		int result = ts.searchInsert(nums, target);
		System.out.println(result);

	}

}
