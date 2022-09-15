public class SinglyLinkedList_tail{

    // initialize Node as public...
    Node head, tail;

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

            head = tail = newNode;
            return;
        }

        else {
            
            Node currNode = head;
        
            while(currNode.next != null) {

                currNode = currNode.next;
            }

            currNode.next = newNode;
            tail = newNode;
            }
    }

    // isEmpty method return true if linkedlist is empty else false...
    public void isEmpty() {
        if(head == null)
            System.out.println("true");
        else 
            System.out.println("false");
    }

    // size method will return size of the linkedlist...
    public void size() {

        int count = 0;

        if(head == null) {

            count = 0;

        }
        else {

            Node currNode = head;

            while(currNode != null) {

                count++;
                currNode = currNode.next;
            }

        }

        System.out.println(count);
    }

    // removeNode method will remove node from linkedlist...
    public void removeNode(String data) {

        if(head == null) {

            System.out.println("No Nodes available!");

        }
        else if(head.data == data) {

            head = head.next;
        }
        else {

            Node currNode = head;
            Node prevNode = null;

            while(currNode.next != null) {
                    
                    if(currNode.data == data) {

                        prevNode.next = currNode.next;
                        return;
                    }
                prevNode = currNode;
                currNode = currNode.next;
            }

            
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

        SinglyLinkedList_tail myMethod = new SinglyLinkedList_tail();

        myMethod.addNode("A");
        myMethod.addNode("B");
        myMethod.addNode("C");
        myMethod.Print();       
        myMethod.isEmpty();
        myMethod.size();
        myMethod.removeNode("B");
        System.out.println("After deleting node...");
        myMethod.Print();       

    }
}