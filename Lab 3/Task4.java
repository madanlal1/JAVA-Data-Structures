// A linked list node  
class Node  
{  
    int data;       // integer data  
    Node next;      // pointer to the next node  
    
    public Node(int data)  
    {  
        // set the data in allocated node and return the node  
        this.data = data;  
        this.next = null;  
    }  
}  
    
class Queue  
{  
    private static Node rear = null, front = null;  
    
    // Utility function to remove front element from the queue and check for Queue Underflow  
    public static int dequeue()     // delete at the beginning  
    {  
    // Write your code here  
        int underflow = front.data;
        if(front != null) {
            front = front.next;
        }
        System.out.println("Removing "+underflow);
        return underflow;
    }  
    
    // Utility function to add an item in the queue  
    public static void enqueue(int item)    // insertion at the end  
    {  
        // Write your code here 
        Node newNode = new Node(item);

        if(front == null) {
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Inserting "+item);
    }  
    
    // Utility function to return top element in a queue  
    public static int peek()   
{  
        // Write your code here  
        return front.data;
    }  
    
    // Utility function to check if the queue is empty or not  
    public static boolean isEmpty()   
    {  
        // Write your code here  
        boolean empty = false;
        if(front == null) {
            empty = true;
        }
        return empty;
    }  
}  
    
class Task4 {  
    public static void main(String[] args)  
    {  
        Queue q = new Queue();  
        q.enqueue(1);  
        q.enqueue(2);  
        q.enqueue(3);  
        q.enqueue(4);  
    
        System.out.printf("Front element is %d\n", q.peek());  
    
        q.dequeue();  
        q.dequeue();  
        q.dequeue();  
        q.dequeue();  
    
        if (q.isEmpty()) {  
            System.out.print("Queue is empty");  
        } else {  
            System.out.print("Queue is not empty");  
        }  
    }  
} 
