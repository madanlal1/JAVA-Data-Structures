class Node {

    int data;
    Node next;

    Node(int data){

        this.data = data;
        this.next = null;
    }
}

public class Task3a {

    Node head;

    public void addNode(int data) {

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

    public void printLinkedList(Node curr) {

        if(curr != null) {
            System.out.print(curr.data+" ");
            printLinkedList(curr.next);
        }
    }

    public static void main(String[] args) {

        Task3a obj = new Task3a();

        obj.addNode(1);
        obj.addNode(2);
        obj.addNode(3);
        obj.addNode(4);
        obj.addNode(5);
        
        obj.printLinkedList(obj.head);
    }
}