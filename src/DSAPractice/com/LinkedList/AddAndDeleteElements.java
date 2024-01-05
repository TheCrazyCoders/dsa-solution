package DSAPractice.com.LinkedList;

class NewNode{
    String data;
    NewNode next;
    public NewNode(String data) {
        this.data = data;
        this.next = null;
    }
}
class LL{
    NewNode head;

    public void addFirst(String data){
        NewNode newNode = new NewNode(data);

       newNode.next = head;
        head = newNode;
    }
    public void addLast(String data) {
        NewNode newNode = new NewNode(data);
        if(head == null){
            newNode = head;
            return;

        }
        NewNode currNode = head;
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
        NewNode currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +"->");
            currNode = currNode.next;
        }

    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;

    }
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        NewNode secondLast = head;
        NewNode lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
}

public class AddAndDeleteElements {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("a");
        list.addLast("list");
        list.addFirst("This");
        list.printList();
        list.deleteFirst();
        System.out.println();
        list.printList();
        list.deleteLast();
        System.out.println();
        list.printList();

    }

}
