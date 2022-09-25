public class Task0b {

    private int len, count;

    Task0b(char arr[]) {
        this.len = arr.length;
        count = 0;
    }

    void ascending(char arr[]) {
        System.out.print(arr[count]+" ");
        if(++count != len)
            ascending(arr);
    }

    
    void descending(char arr[]) {
        System.out.print(arr[--len]+" ");
        if(len > 0)
            descending(arr);
    }

    public static void main(String[] args) {

        char arr[] = {'m','a','d','a','n'};

        Task0b obj = new Task0b(arr);
        System.out.println("Ascending Order: ");
        obj.ascending(arr);
        System.out.println("\nDescending Order: ");
        obj.descending(arr);
    }
}