package com.leet.palindrome_9;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int temp = x;
        int reverseNum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reverseNum = reverseNum * 10 + digit;
            temp = temp / 10;
        }

        // Ensure that x is non-negative and that it matches its reverse
        return x == reverseNum && x >= 0;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        // Test case 1: palindrome number
        int num1 = 121;
        boolean result1 = palindrome.isPalindrome(num1);
        System.out.println(num1 + " is a palindrome: " + result1);

        // Test case 2: negative number (not a palindrome)
        int num2 = -121;
        boolean result2 = palindrome.isPalindrome(num2);
        System.out.println(num2 + " is a palindrome: " + result2);

        // Test case 3: not a palindrome
        int num3 = 123;
        boolean result3 = palindrome.isPalindrome(num3);
        System.out.println(num3 + " is a palindrome: " + result3);

        // Test case 4: single-digit number (always a palindrome)
        int num4 = 7;
        boolean result4 = palindrome.isPalindrome(num4);
        System.out.println(num4 + " is a palindrome: " + result4);
    }
}
