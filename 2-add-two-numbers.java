/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String num1String = "";
        String num2String = "";

        while (l1.next != null) {
            num1String += l1.val;
            l1 = l1.next;
        }

        num1String += l1.val;

        while (l2.next != null) {
            num2String += l2.val;
            l2 = l2.next;
        }
        num2String += l2.val;

        String num1StringReversed = new StringBuilder(num1String).reverse().toString();
        String num2StringReversed = new StringBuilder(num2String).reverse().toString();
        BigInteger numberToPutOut = new BigInteger(num1StringReversed).add(new BigInteger(num2StringReversed));
        String stringNumberToPutOut = numberToPutOut + "";
        int outputLength = stringNumberToPutOut.length();

        ListNode output = new ListNode(Integer.parseInt(stringNumberToPutOut.substring(outputLength - 1, outputLength)));
        ListNode current = output;
        for (int i = outputLength - 1; i > 0; i--) {
            current.next = new ListNode();
            current = current.next;
            current.val = Integer.parseInt(stringNumberToPutOut.substring(i - 1, i));
        }
        return output;
    }
}
