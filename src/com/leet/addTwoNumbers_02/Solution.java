package com.leet.addTwoNumbers_02;

class ListNode {
 int val;
 ListNode next;
 ListNode() {}
 ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode result = new ListNode(0);
     ListNode ptr = result;

     int carry = 0;

     while (l1 != null || l2 != null) {
         int sum = carry;
         if (l1 != null) {
             sum += l1.val;
             l1 = l1.next;
         }
         if (l2 != null) {
             sum += l2.val;
             l2 = l2.next;
         }

         carry = sum / 10;
         sum = sum % 10;
         ptr.next = new ListNode(sum);
         ptr = ptr.next;
     }
     if (carry != 0) {
         ptr.next = new ListNode(carry);
     }

     return result.next;
 }

 public static void main(String[] args) {
     Solution solution = new Solution();

     // Create first linked list: 2 -> 4 -> 3 (represents 342)
     ListNode l1 = new ListNode(2);
     l1.next = new ListNode(4);
     l1.next.next = new ListNode(3);

     // Create second linked list: 5 -> 6 -> 4 (represents 465)
     ListNode l2 = new ListNode(5);
     l2.next = new ListNode(6);
     l2.next.next = new ListNode(4);

     // Add the two numbers
     ListNode result = solution.addTwoNumbers(l1, l2);

     // Print the result
     System.out.print("Result: ");
     while (result != null) {
         System.out.print(result.val + " ");
         result = result.next;
     }
 }
}
