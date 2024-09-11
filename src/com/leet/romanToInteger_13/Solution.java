package com.leet.romanToInteger_13;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> myMap = new HashMap<>();
        myMap.put('I', 1);
        myMap.put('V', 5);
        myMap.put('X', 10);
        myMap.put('L', 50);
        myMap.put('C', 100);
        myMap.put('D', 500);
        myMap.put('M', 1000);

        int result = myMap.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (myMap.get(s.charAt(i)) < myMap.get(s.charAt(i + 1))) {
                result = result - myMap.get(s.charAt(i));
            } else {
                result = result + myMap.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String roman = "MCMXCIV"; // example Roman numeral
        int result = solution.romanToInt(roman);
        System.out.println("Integer value of Roman numeral " + roman + " is: " + result);
    }
}

