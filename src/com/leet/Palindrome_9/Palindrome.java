package com.leet.Palindrome_9;

public class Palindrome {
	public boolean isPalindrome(int x) {
		int temp = x;
		int reverseNum=0;
		
		while(temp!=0) {
			int digit = temp % 10;
			reverseNum  = reverseNum * 10 + digit;
			temp = temp /10;	
		}
		if(x == reverseNum && x>0) 
		return true;
		return false;
        
    }
}
