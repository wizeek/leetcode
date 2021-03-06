package com.wizeek.leetcode.p2;

/**
 * Created by Artur on 6/2/2018.
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        if (x < 0 || x > 9) {
            throw new IllegalArgumentException("Digit must be between 0 and 9");
        }
        val = x;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ListNode)) {
            return false;
        }
        ListNode casted = (ListNode) o;
        if (casted.val != val) {
            return false;
        }
        if (casted.next == null) {
            if (next == null) {
                return true;
            } else {
                return false;
            }
        }
        if (next == null) {
            return false;
        }
        return casted.next.equals(next);
    }

    @Override
    public String toString() {
        return "{val = " + val + ", next = " + (next == null ? "null" : next.toString() + "}");
    }
}