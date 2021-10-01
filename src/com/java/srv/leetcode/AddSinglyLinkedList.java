package com.java.srv.leetcode;

import com.java.srv.linklist.DisplayInsertionLinkedList;

public class AddSinglyLinkedList {
    static ListNode l1;
    static ListNode l2;

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        //first node
        int arr1[] = {5, 9, 9, 9, 9, 9, 4};
        int arr2[] = {9, 9, 9, 9};
        for (int i = 0; i < arr1.length; i++) {
            ListNode new_node = new ListNode(arr1[i]);
            new_node.next = l1;
            l1 = new_node;
        }
        for (int i = 0; i < arr2.length; i++) {
            ListNode new_node2 = new ListNode(arr2[i]);
            new_node2.next = l2;
            l2 = new_node2;
        }

        addTwoNumbers(l1, l2);


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        int carry = 0;

        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            curr.next = node;
            curr = curr.next;
        }
        return temp.next;
    }
}
