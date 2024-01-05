package DSAPractice.com.LinkedList;

class LinkedListClass{
    Node head;
    public void reverseIterate() {
        if(head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            //update
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;
    }
    public Node reverseRecursive(Node head) {
        // empty node || last node or only one node
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public void addElement(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLastElement(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
             currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +" ");
            currNode = currNode.next;
        }
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedListClass linkedlist = new LinkedListClass();
        linkedlist.addElement(1);
        linkedlist.addElement(2);
        linkedlist.addElement(3);
        linkedlist.addElement(4);
        linkedlist.addElement(5);
        linkedlist.addLastElement(0);

        linkedlist.printList();
        System.out.println();
        linkedlist.reverseIterate();
        System.out.println("Reversed linked list");
        linkedlist.printList();
        System.out.println();
        System.out.println("Reversed linked list using recursion");
        linkedlist.head = linkedlist.reverseRecursive(linkedlist.head);
        linkedlist.printList();

    }
}
