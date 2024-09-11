package com.leet.removeDuplicate_26;

public class DeleteDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueIndex = 0;  // This keeps track of the last unique element
        
        for (int i = 1; i < nums.length; i++) {
            // If the current number is different from the last unique one, we move it forward
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        
        // Print the array after removing duplicates
        for (int i = 0; i <= uniqueIndex; i++) {
            System.out.print(nums[i] + " ");
        }
        
        return uniqueIndex + 1;  // Return the number of unique elements
    }

    public static void main(String[] args) {
        DeleteDuplicates deleteDuplicates = new DeleteDuplicates();
        
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = deleteDuplicates.removeDuplicates(nums);
        System.out.println("\nNew length after removing duplicates: " + newLength);
    }
}
