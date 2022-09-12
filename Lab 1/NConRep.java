public class NConRep {

    public static void main(String[] args) {

        int array[][] = {{1,2,3,4},{5,6,7,8},{9,9,9,9},{10,11,12,13}};
        boolean consiquent = false;

        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                // String data = j[0];
                if(array[i][0] == array[i][1] && array[i][1] == array[i][2] &&array[i][2] == array[i][3])
                {
                    consiquent = true;
                }
            }
        }

        if(consiquent) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}