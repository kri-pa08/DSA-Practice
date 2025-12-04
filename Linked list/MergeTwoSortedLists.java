class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 != null) temp.next = list1;
        else temp.next = list2;

        return dummy.next;
    }

    // Main method to test in VS Code
    public static void main(String[] args) {
        // Creating list1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Creating list2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        MergeTwoSortedLists obj = new MergeTwoSortedLists();
        ListNode head = obj.mergeTwoLists(list1, list2);

        // Printing the merged list
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

