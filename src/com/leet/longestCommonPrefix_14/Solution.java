package com.leet.longestCommonPrefix_14;

import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int index = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        return index == 0 ? "" : str1.substring(0, index);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"flower", "flow", "flight"}; // example input
        String result = solution.longestCommonPrefix(strs);
        System.out.println("Longest common prefix: " + result);
    }
}

