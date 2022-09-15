public class LinkedList_Cycle{

    // initialize Node as public...
    Node head;

    // established Node Class
    class Node {
        
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // construct function for adding node at first/middle/last...
    public void addNode(String data) {

        Node newNode = new Node(data);
        
        if(head == null) {

            head = newNode;
            return;
        }

        else {
            
            Node currNode = head;
        
            while(currNode.next != null) {

                currNode = currNode.next;
            }

            currNode.next = newNode;
            }
    }

    // ----------------
    public void isCycle() {

        boolean cycle = false;
        Node currNode = head;
        Node pointer = head.next;

            while(currNode != null) {

                while(pointer != null)
                {
                    if(currNode.data == pointer.data)
                    {
                        cycle = true;
                    }

                    pointer = pointer.next;
                }

                currNode = currNode.next;

            }
            if(cycle) {
                System.out.println("Cycle...");
            }
            else {
                System.out.println("No Cycle...");
            }
    }

  
    // construct method for printing nodes...
    public void Print() {

        if(head == null) {

            System.out.println("Linkedlist is empty!");

        }
        else {

            Node currNode = head;

            while(currNode != null) {

                System.out.print(currNode.data + " -> ");
                currNode = currNode.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {

        LinkedList_Cycle myMethod = new LinkedList_Cycle();

        myMethod.addNode("A");
        myMethod.addNode("B");
        myMethod.addNode("C");
        myMethod.Print();       
        myMethod.isCycle();       

    }
}