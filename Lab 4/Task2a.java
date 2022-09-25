public class Task2a {

    int result;

    Task2a() {
        result = 1;
    }

    int factorial(int num) {
        result *= num;
        if(--num > 0)
            factorial(num-1);
        return result;
    }

    public static void main(String[] args) {

        Task2a obj = new Task2a();

        System.out.println("Factorial of 5 is: "+obj.factorial(5));
    }
}