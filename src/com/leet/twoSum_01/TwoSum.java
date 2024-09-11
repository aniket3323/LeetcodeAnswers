package com.leet.twoSum_01;

import java.util.Arrays;

/**
 * @author Aniket
 *
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null; // return null if no pair adds up to the target
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        // Test case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum.twoSum(nums1, target1);
        System.out.println("Indexes: " + Arrays.toString(result1));  // Expected: [0, 1]

        // Test case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum.twoSum(nums2, target2);
        System.out.println("Indexes: " + Arrays.toString(result2));  // Expected: [1, 2]

        // Test case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum.twoSum(nums3, target3);
        System.out.println("Indexes: " + Arrays.toString(result3));  // Expected: [0, 1]
    }
}
