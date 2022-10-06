public class Task6 {

    public void findGoal(int[][] arr, int goal) {

        boolean found = false;

        for(int i=0; i<4; i++) {

            for(int j=0; j<4; j++) {
                if(arr[i][j] == -1 && arr[j][i] == -1 && i==j) {
                    found = true;
                    System.out.println("You are Blocked!");
                    break;
                }
                else if(arr[i][j] != -1) {
                    if(arr[i][j] == goal) {
                        found = true;
                        System.out.println("Goal Found...");
                        break;
                    }
                }
                else if(arr[j][i] != -1) {
                    if(arr[j][i] == goal) {
                        found = true;
                        System.out.println("Goal Found...");
                        break;
                    }
                }
                else if(i==j && arr[i][j] != -1) {
                    if(arr[i][j] == goal) {
                        found = true;
                        System.out.println("Goal Found...");
                        break;
                    }
                }
                
            }
            if(found) {
                break;
            }
        }

    }

    public static void main(String[] args) {

        Task6 obj = new Task6();

        int array[][] = { {1,-1,-1,3} ,
                          {-1,-1,3,6} ,
                          {2,5,6,8} ,
                          {3,6,7,100} };

        obj.findGoal(array,100);


    }
}