// Name : Madan Lal 
// CMS  : 053-18-0005
// Mid Exam
// Subject : Data Structure
// Instructor : Dr. Muhammad Hussain Mughal

class Node {
    int data;
    Node next;

    // Node constructor
    Node(int data) {

        this.data = data;
        this.next = null;
    }
}

public class DSLabMidExam {

    // for Even numbers
    Node head1;

    // for odd numbers
    Node head2;
    
    // class constructor
    DSLabMidExam() {
        head1 = null;
        head2 = null;
    }

    // method implementation of auto seperate inputs
    public void autoSeperate(int data) {

        Node newNode = new Node(data);
        boolean found1 = true;
        boolean found2 = true;

        // seperating data...
        if(data%2 == 0) {
            
            if(head1 == null) {
                head1 = newNode;
            }
            else {

                Node curr = head1;
                while(curr.next != null) {
                    if(curr.data == data) {
                        found1 = false;
                        break;
                    }
                    curr = curr.next;
                }
                if(found1) {
                    curr.next = newNode;
                }
            }
        }
        else {
            if(head2 == null) {
                head2 = newNode;
            }
            else {

                Node curr = head2;
                while(curr.next != null) {
                    if(curr.data == data) {
                        found2 = false;
                        break;
                    }
                    curr = curr.next;
                }
                if(found2) {
                    curr.next = newNode;
                }
            }
        }
    }

    // print method implementation of first LinkedList
    public void printFirstLinkedList() {

        Node start1 = head1;

        while(start1 != null) {

            System.out.print(start1.data+" -> ");
            start1 = start1.next;
        }
            System.out.print(" NULL");
    }

    // print method implementation of second LinkedList
    public void printSecondLinkedList() {

        Node start2 = head2;

        while(start2 != null) {

            System.out.print(start2.data+" -> ");
            start2 = start2.next;
        }
            System.out.print(" NULL");
    }


    public static void main(String[] args) {

        // creating object of class
        DSLabMidExam obj = new DSLabMidExam();


        // inserting data into folders seperately
        obj.autoSeperate(1);
        obj.autoSeperate(7);
        obj.autoSeperate(6);
        obj.autoSeperate(22);
        obj.autoSeperate(204);
        obj.autoSeperate(6);
        obj.autoSeperate(3);
        obj.autoSeperate(7);
        obj.autoSeperate(27);

        // printing first linkedlist
        obj.printFirstLinkedList();

        // just for new line
        System.out.println();

        // printing second linkedlist
        obj.printSecondLinkedList();
    }
}