package Break;

public class break_without_label {
    public static void main(String[] args) {
        //print the number from 1 to 10 , whenever the value the 6 stop printing further values.
        for (int i=1 ; i<=10 ; i++)
        {
            if (i==6) {
                break;
            }
            System.out.println(i);

        }//ending of for loop
        System.out.println("end of statement");
    }
}
