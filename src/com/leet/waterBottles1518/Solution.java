package com.leet.waterBottles1518;

public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = numBottles; // initially, drink all full bottles

        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange; // full bottles you get by exchanging
            totalDrank += newBottles; // add these new bottles to total drank
            numBottles = newBottles + (numBottles % numExchange); // remaining bottles after exchange
        }

        return totalDrank;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numWaterBottles(9, 3));  // Output: 13
    }
}


	

