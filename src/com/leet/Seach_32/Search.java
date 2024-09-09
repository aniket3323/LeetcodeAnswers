package com.leet.Seach_32;

class Search {
	
	
    public int searchInsert(int[] nums, int target) {
    	for(int i = 0; i<nums.length; i++)
    	{
    		if(nums[i]==target) {
    			return i;
    		}
    	}
    	
//    	int [] nums =  new int[] {1,3,5,6};
//		int target = 2;
    	
    	for(int i = 0; i<nums.length; i++)
    	{
    		if(nums[i]>target) {
    			return i;
    		}
    	}
    	return nums.length;
    }
}

