public class SumEqualK {

    public String findSum(int[] arr, int k) {

        boolean found = true;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(arr[i] + arr[j] == k) {
                    found = true;
                    break;
                }
                if(i == arr.length-1) {
                    found = false;
                }
            }
        }

        if(found) return "yes";
        else      return "no";
    }

    public static void main(String[] args) {

        SumEqualK obj = new SumEqualK();

        int[] arr = {1,2,3,4,5,6};

        obj.findSum(arr, 7);

    }
}