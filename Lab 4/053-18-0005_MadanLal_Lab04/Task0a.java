public class Task0a {

    int count;

    Task0a() {
        count = 1;
    }

    void ascending(int N) {
        System.out.print(count+" ");
        if(count++ != N)
            ascending(N);
    }

    
    void descending(int N) {
        System.out.print(N+" ");
        if(N > 1)
            descending(N-1);
    }



    public static void main(String[] args) {

        Task0a obj = new Task0a();

        System.out.println("Ascending Order: ");
        obj.ascending(5);

        System.out.println("\nDescending Order: ");
        obj.descending(5);

    }
}