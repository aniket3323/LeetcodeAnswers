package com.leet.longestSubstring;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max_length = 0;
        List<Character> list = new ArrayList<>();
        while (end < s.length()) {
            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                max_length = Math.max(max_length, list.size());
                end++;
            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcabcbb"; // example input
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}

