import java.util.*;  	  	
// Class for queue  	
class Queue   	{  	    
    private int arr[];  	    
    private int front;  	    
    private int rear;  	    
    private int capacity;  
    private int count;  
        
    // Constructor to initialize queue  
    Queue(int size)  
    {  
        arr = new int[size];  
        capacity = size;  
        front = 0;  
        rear = -1;  
        count = 0;  
    }  
    
    // Utility function to remove front element from the queue and check for Queue Underflow  
    public void dequeue()  
    {  
        // Write your code here
        if(count == 0) {
            System.out.println("Queue is empty!");
        }  
        else {
            System.out.println("Removing "+arr[front]);
            for(int i=0; i<capacity-1; i++) {
                    arr[i] = arr[i+1];
            } 
            rear--;
            count--;
        }
    }  
    
    // Utility function to add an item to the queue and check for queue overflow  
    public void enqueue(int item)  
    {  
        // Write your code here  
        if(count == capacity) {
            System.out.println("Queue Overflow!");
        }
        else {
            count++;
            arr[++rear] = item;
            System.out.println("Inserting "+item);
        }
    }  
    
    // Utility function to return front element in the queue and check for Queue Underflow  
    public int peek()  
    {  
        // Write your code here  
        int frontValue;
        if(count>0) {
            frontValue =  arr[front];
        } 
        else {
            frontValue = 0;
        }
        
        return frontValue;
    }  
    
    // Utility function to return the size of the queue  
    public int size()  
    {  
        // Write your code here  
        return capacity;
    }  
    
    // Utility function to check if the queue is empty or not  
    public Boolean isEmpty()  
    {  
        // Write your code here  
        Boolean empty = false;
        if(count == 0) {
            empty = true;
        }
        return empty;
    }  
    
    // Utility function to check if the queue is empty or not  
    public Boolean isFull()  
    {  
        // Write your code here  
        Boolean full = false;
        if(count == capacity) {
            full = true;
        }
        return full;
    }  
}  
    
public class Task3  
{     
    // main function  
    public static void main (String[] args)  
    {  
        // create a queue of capacity 5  
        Queue q = new Queue(5);  

        q.enqueue(1);  
        q.enqueue(2);  
        q.enqueue(3);  
        q.enqueue(4);  
        q.enqueue(5);  
        q.enqueue(6);  
            
        System.out.println("Front element is: " + q.peek());  
        q.dequeue();  
        System.out.println("Front element is: " + q.peek());  
    
        System.out.println("Queue size is " + q.size());  
    
        q.dequeue();  
        q.dequeue();  
            
        if (q.isEmpty())  
            System.out.println("Queue Is Empty");  
        else  
            System.out.println("Queue Is Not Empty");  
    }  
}  
