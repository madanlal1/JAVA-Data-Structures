class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Task3{

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

    public void makeCycle(int data) {

        Node curr1 = head;
        Node curr2 = head;

        while(curr1.next != null) {
            curr1 = curr1.next;
        }

        while(curr2.next != null) {
            if(curr2.data == data) {
                curr1.next = curr2;
                break;
            }
            curr2 = curr2.next;
        }
    }

    public void cycleDetection() {
        Node fast = head;
        Node slow = head;

        if(head == null){
            System.out.println("false");
        }
        else {
            while(fast != null && fast.next != null) {

                fast = fast.next.next;
                slow = slow.next;

                if(fast == slow) {
                    System.out.println("true");
                    break;
                }
            }
            System.out.println("false");
        }
    }


    public static void main(String[] args) {

        Task3 obj = new Task3();

        obj.insertNode(1);
        obj.insertNode(2);
        obj.insertNode(3);
        obj.insertNode(4);

        obj.makeCycle(2);

        obj.cycleDetection();


    }
}