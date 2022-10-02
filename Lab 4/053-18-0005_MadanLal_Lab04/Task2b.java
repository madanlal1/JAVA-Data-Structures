import java.util.Scanner;

public class Task2b {

    int result;

    Task2b() {
        result = 1;
    }

    int factorial(int num) {
        result *= num;
        if(--num > 0)
            factorial(num-1);
        return result;
    }

    public static void main(String[] args) {

        Task2b obj = new Task2b();
        Scanner input = new Scanner();

        System.out.print("Enter Number for Factorial >> ");
        input.next();

        System.out.println("Factorial of 5 is: "+obj.factorial(input));

    }
}