package DSAPractice.com.LinkedList;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SwapNodesInPairs {

    public static ListNode swapPairs(ListNode head) {
        // Dummy node to simplify edge cases and serve as the new head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        // Iterate through the list, swap adjacent nodes
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;

            // Swap nodes
            first.next = second.next;
            second.next = first;
            current.next = second;

            // Move to the next pair
            current = current.next.next;
        }

        return dummy.next;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original Linked List:");
        printList(head);

        // Swap adjacent nodes
        ListNode swappedHead = swapPairs(head);

        System.out.println("Linked List after Swapping Adjacent Nodes:");
        printList(swappedHead);
    }
}
