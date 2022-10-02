import java.util.*;  
    
// Implement Queue using two stacks  
class Task6 {  
    private int arr[];
    int top;
    int capacity;
    
    // Constructor  
    Task6(int size) {  
        this.arr = new int[size];  
        this.top = -1;
        this.capacity = size;
    }  
    
    // Enqueue an item to the queue  
    public void enqueue(int data)   
    {  
        // Write your code here  
        if(top == capacity) {
            System.out.println("Stack Overflow!");
        }
        else {
            arr[++top] = data;
            System.out.println("Inserting "+data);
        }
    }  
    
    // Dequeue an item from the queue  
    public int dequeue()   
    {  
        int result;

        if(top == -1) {
            System.out.println("Stack underflow!");
            result = -1;
        }
        else {
            result =  arr[top--];
        }
        return result;
    }  
    
    public static void main(String[] args) {  
        int[] keys = { 1, 2, 3, 4, 5 };  
        Task6 q = new Task6(5);  
    
        // insert above keys  
    for (int key : keys) {  
            q.enqueue(key);  
        }  

        System.out.println("Removing "+q.dequeue());    // print 1  
        System.out.println("Removing "+q.dequeue());    // print 2  
    }  
} 
