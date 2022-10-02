import java.util.*;  	  	// A linked list node  	

class Node  	
{  	    
    int data;       // integer data  	    
    Node next;      // pointer to the next node  

    Node(int data) {
        this.data = data;
        this.next = null;
    }	
};  	  

class Stack  
{  
    private Node top;  
    
    public Stack() {  
        this.top = null;  
    }  
    
    // Utility function to add an element x in the stack  
    public void push(int x) // insert at the beginning  
    {  
        // Write your code here  
        Node newNode = new Node(x);

        if(top == null) {
            top = newNode;
        }
        else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println("Inserting "+x);
    }  
    
    // Utility function to check if the stack is empty or not  
    public boolean isEmpty()  
    {  
        // Write your code here  
        boolean result = false;
        if(top == null)
            result = true;

        return result;
    }  
    
    // Utility function to return top element in a stack  
    public int peek()  
    {  
        // Write your code here  
        return top.data;
    }  
    
    // Utility function to pop top element from the stack and check for Stack underflow  
    public void pop() // remove at the beginning  
    {  
        // Write your code here  
        if(top == null) {
            System.out.println("Stack is empty!");
        }
        else {
            System.out.println("Removing "+top.data);
            top = top.next;
        }
    }  
}  
    
class Task2  
{  
    public static void main(String[] args)  
    {  
        Stack stack = new Stack();  
    
        stack.push(1);  
        stack.push(2);  
        stack.push(3);  
    
        System.out.println("Top element is " +  stack.peek());  
    
        stack.pop();  
        stack.pop();  
        stack.pop();  
    
        if (stack.isEmpty()) {  
            System.out.print("Stack is empty");  
        } else {  
            System.out.print("Stack is not empty");  
        }  
    }  
}  
