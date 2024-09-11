package com.leet.minimumBitFlip_2220;

public class Solution {
    public int minBitFlips(int start, int goal) {
        return Integer.bitCount(start ^ goal);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int start = 10; // example start value
        int goal = 7;   // example goal value
        int result = solution.minBitFlips(start, goal);
        System.out.println("Minimum bit flips needed: " + result);
    }
}

