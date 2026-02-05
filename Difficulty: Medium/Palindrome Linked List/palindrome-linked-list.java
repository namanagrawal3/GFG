/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node first = head;
        Node second = reverse(slow.next);
        while (second != null) {
            if (first.data != second.data)
                return false;
            first = first.next;
            second = second.next;
        }
        
        return true;
    }
    public static Node reverse(Node node) {
        Node prev = null;
        Node curr = node;
        while (curr != null) {
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}