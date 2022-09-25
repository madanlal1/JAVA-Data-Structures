import java.util.*;  
    
// Implement Queue using two stacks  
class Task5 {  
    private Stack s1, s2; 
    
    // Constructor  
    Task5() {  
        s1 = new Stack();  
        s2 = new Stack();  
    }  
    
    // Enqueue an item to the queue  
    public void enqueue(int data)   
    {  
        // Write your code here  
        s1.push(data);
    }  
    
    // Dequeue an item from the queue  
    public int dequeue()   
    {  
        // Write your code here  
        // int result;
        // if(s1.empty())
        System.out.println(s1.size());
        //     return 0;
        // else 
        //     s1.pop();
        // else {

        //     while(s1.size() != 0) {
        //         s2.push(s1.pop());
        //     }

        //     result = s2.pop();

        //     while(s2.size() != 0) {
        //         s1.push(s2.pop());
        //     }
        // }
        // return result;


    }  
    
    public static void main(String[] args) {  
        int[] keys = { 1, 2, 3, 4, 5 };  
        Task5 q = new Task5();  
    
        // insert above keys  
    for (int key : keys) {  
            q.enqueue(key);  
        }  

        System.out.println(q.dequeue());    // print 1  
        System.out.println(q.dequeue());    // print 2  
    }  
} 
