class Node {  
    
        String name;  
        Node prev, next;  
        
        Node (String name)  
        {  
            this.prev = null;  
            this.next = null;  
            this.name = name;  
        }  
}

public class DoubleLinkedList {  
    
    Node head;  

    // Add node with name in beginning of linkedlist, name as param  
    public void insertAtBeginning(String name)  
    {  
        Node newNode = new Node(name);
        insertAtBeginning(newNode);
    }  
     
    // Add node with name in beginning of linkedlist, node as param  
    public void insertAtBeginning(Node newNode)  
    {  

        if(head == null) {
            head = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }  


    // Add node in end of linedlist, name as param  
    public void insertAtEnd(String name)  
    {  
        Node newNode = new Node(name);
        insertAtEnd(newNode);
    }  
    // Add node in end of linedlist, node as param  
    public void insertAtEnd(Node newNode)  
    {  
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;

    }  
    // Add node after name which is provided as param , name and node as params  
    public void insertAftername(String name, Node newNode)  
    {  
        Node currNode = head;
        Node prevNode = null;

        while(currNode.name != name) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        
        newNode.next = currNode.next;
        newNode.prev = currNode;
        currNode.next = newNode;

    }  
    // Add node before name which is provided as param , name and node as params  
    public void insertBeforename(String name, Node newNode)  
    {  
        Node currNode = head;
        Node prevNode = null;

        while(currNode.name != name) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        
        newNode.next = currNode;
        newNode.prev = prevNode;
        prevNode.next = newNode;
        currNode.prev = newNode;
    }   
        
    // Print all the nodes in linkedlist, make sure it works on circular double linkedlist  
    public void printAll()  
    {  
        Node currNode = head;

        while(currNode != null) {

            System.out.print(currNode.name + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");        
    }  
    // Test the class  		
    public static void main(String[] args) {  
        
        DoubleLinkedList list = new DoubleLinkedList();

        list.insertAtBeginning("This");
        list.insertAtEnd("Apple");

        Node newNode = new Node("is");
        list.insertAftername("This",newNode);

        Node newNode2 = new Node("an");
        list.insertBeforename("Apple", newNode2);

        list.printAll();
        list.makeCircular();
    
    }
    
}
