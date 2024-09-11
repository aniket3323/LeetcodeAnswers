package com.leet.Seach_32;

class Search {

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                return i;
            }
        }
        
        return nums.length;
    }

    public static void main(String[] args) {
        Search search = new Search();
        
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        
        int result = search.searchInsert(nums, target);
        System.out.println("The target " + target + " is at index: " + result);
        
        target = 2;
        result = search.searchInsert(nums, target);
        System.out.println("The target " + target + " should be inserted at index: " + result);
        
        target = 7;
        result = search.searchInsert(nums, target);
        System.out.println("The target " + target + " should be inserted at index: " + result);
        
        target = 0;
        result = search.searchInsert(nums, target);
        System.out.println("The target " + target + " should be inserted at index: " + result);
    }
}
