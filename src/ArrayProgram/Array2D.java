package ArrayProgram;

public class Array2D {
    public static void main(String[] args) {

        //syantx1
        int[][] a1 = new int[5][4];
        //int a1[][] = new int[5][4];

        //syantx2:
        int[][] a2 = {{10,20,30,40},
                       {2, 4, 5, 6}};

        int value = 8;
        //how to write the data to 2D array
        for (int row=0 ; row<5 ; row++)
        {
            for (int col=0 ; col<4 ; col++)
            {
                a1[row][col] = value++; //writing the data
                //System.out.print(a1[row][col] + "    "); // printing/reading the data
            }
           // System.out.println(); //formating output similar to excel sheet
        }


        //how to read the data from 2d array
        for (int row=0 ; row<5 ; row++)
        {
            for (int col=0 ; col<4 ; col++)
            {
                System.out.print(a1[row][col] + "    ");
            }
            System.out.println();
        }
    }
}
