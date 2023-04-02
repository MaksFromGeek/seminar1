package org.example.cw4;

/**
 * Задача 206 с leetcode.com . Перевернуть связанный список (Linked List)
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 */
public class task1 {
    public ListNode reverseList(ListNode head) {
        ListNode pred = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextElem = current.next;
            current.next = pred;
            pred = current;
            current = nextElem;
        }
        return pred;
    }
        }

