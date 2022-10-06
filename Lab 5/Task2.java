class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Task2{

    Node head = null;

    public void insertNode(int data){

        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }
        else {
            Node curr = head;

            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }
    
    public void printNode(){

        Node curr = head;

        if(head == null) {

            System.out.print("LinkedList is empty!");
        }
        else {

            while(curr != null) {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
                System.out.print("null");
        }
    }

    public Node ReverseLinkedList(Node head) {

        if(head == null || head.next == null) {
            return head;
        }
    
            Node newHead = ReverseLinkedList(head.next);
            head.next.next = head;
            head.next = null;

            return newHead;
    }

    public static void main(String[] args) {

        Task2 obj = new Task2();

        obj.insertNode(1);
        obj.insertNode(2);
        obj.insertNode(3);
        obj.insertNode(4);

        System.out.println("Before Reversing : ");
        obj.printNode();

        obj.head = obj.ReverseLinkedList(obj.head);

        System.out.println("\nAfter Reversing : ");
        obj.printNode();
        
    }
}