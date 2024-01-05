package DSAPractice.com.LinkedList;
//Q. Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
// Search for the number 7 & display its index.

//Method 2: When we are not allowed to use in-built libraries
//First, create a generic node class.
//Create a LinkedList class and initialize the head node to null.
//Create the required add and search functions.
//Initialize the LinkedList in the main method.
//Use the search method to find the element.

class LinkedList{
    Node head;
     public void addElement(int data){

         Node newNode = new Node(data);
         if (head == null) {
             head = newNode;
         }else{
             Node current = head;
             while(current.next != null){
                 current = current.next;
             }
             current.next = newNode;
         }

     }
     public int searchIndex(int target){
         Node current = head;
         int index = 0;
         while(current.next!=null){
             if(current.data == target){
                 return index;
             }
             current = current.next;
             index++;

         }

         return -1;
     }
}

public class SearchElelmentInLL2 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addElement(1);
        linkedList.addElement(5);
        linkedList.addElement(7);
        linkedList.addElement(3);
        linkedList.addElement(8);
        linkedList.addElement(2);
        linkedList.addElement(3);
         int target = 3;

        int index = linkedList.searchIndex(target);
        System.out.println("Index of target element is: " +index);
    }
}
