package com.leet.removeDuplicate_26;

public class deleteDuplicateMain {

	public static void main(String[] args) {
		DeleteDuplicates dd = new DeleteDuplicates();
//		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int[] nums = {1,1,2};
		int result = dd.removeDuplicates(nums);
		
		System.out.println("Output = "+result);
		
		
	}

}
