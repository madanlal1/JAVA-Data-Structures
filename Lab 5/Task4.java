import java.util.Stack;
public class Task4 {

    private Stack stack;

    Task4() {
        stack = new Stack();
    }

    public void push(char data) {
        stack.push(data);
    }

    public void print() {
        
    }

    public void balancedBrakets(String input) {

        for(int i=0; i<input.length; i++) {
            stack.push(input[i]);
        }

        // pushed then pull then compare if equal brackets (compare '(' '{' '['     )  
    }

    public static void main(String[] args) {

        Task4 obj = new Task4();


    }
}