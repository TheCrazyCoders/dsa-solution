package DSAPractice.com.LinkedList;
import java.util.*;

import java.util.Scanner;

//Take elements(numbers in the range of 1-50) of a Linked List as input from the user.
// Delete all nodes which have values greater than 25.


    class Nodes {
        int data;
        Node next;

        public Nodes(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedLists {
        Node head;

        public void addElement(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public void deleteNodesGreaterThan(int threshold) {
            Node current = head;
            Node previous = null;

            while (current != null) {
                if (current.data > threshold) {
                    if (previous == null) {
                        // If the node to be deleted is the head
                        head = current.next;
                    } else {
                        // If the node to be deleted is not the head
                        previous.next = current.next;
                    }
                } else {
                    // Move to the next node
                    previous = current;
                }

                // Move to the next node
                current = current.next;
            }
        }

        public void displayList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public class AddRangeOfElementsInLL {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            LinkedLists linkedList = new LinkedLists();

            System.out.print("Enter the number of elements in the linked list: ");
            int n = scanner.nextInt();

            System.out.println("Enter elements (numbers in the range of 1-50):");
            for (int i = 0; i < n; i++) {
                int element = scanner.nextInt();
                if (element >= 1 && element <= 50) {
                    linkedList.addElement(element);
                } else {
                    System.out.println("Invalid input! Please enter a number in the range of 1-50.");
                    i--; // Decrement i to re-enter the invalid input
                }
            }

            System.out.println("Original Linked List:");
            linkedList.displayList();

            // Delete nodes with values greater than 25
            linkedList.deleteNodesGreaterThan(25);

            System.out.println("Linked List after deleting nodes with values greater than 25:");
            linkedList.displayList();
        }
    }


