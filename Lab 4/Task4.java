public class Task4 {

    int arr[] = {55, 22, 26, 45, 88};

    public int found(int search) {

        int result = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == search) {
                result = 1;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Task4 obj = new Task4();

        obj.found(22);
    }
}