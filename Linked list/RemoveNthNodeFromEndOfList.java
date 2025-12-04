//Remove Nth Node From End of List
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the Nth node
        slow.next = slow.next.next;

        return dummy.next;
    }

    // Main method for VS Code testing
    public static void main(String[] args) {
        // Creating linked list: [1, 2, 3, 4, 5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        RemoveNthNodeFromEndOfList obj = new RemoveNthNodeFromEndOfList();
        head = obj.removeNthFromEnd(head, 2); // remove 2nd node from end

        // Print output list
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
