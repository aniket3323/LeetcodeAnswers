package com.leet.removeDuplicate_26;

public class DeleteDuplicates {
	 public int removeDuplicates(int[] nums) {
		 int count = 0;
	        for(int i = 0;i<nums.length;i++) {
	        	for(int j = i+1;j<nums.length;j++) {
	        		if(nums[i]==nums[j]) {
	        			count++;
	        			nums[j]= 0;
	        		}
	        	}
	        }
	        for(int i = 0;i<nums.length;i++) {
	        	System.out.print(nums[i]+ " ");
	        }
		 return (nums.length-count);
	    }
}
