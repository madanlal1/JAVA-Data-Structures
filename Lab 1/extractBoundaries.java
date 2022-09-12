public class extractBoundaries {

    public static void main(String[] args) {

        int array[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                if(i==0 || i==3 || j==0 || j==3)
                {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}