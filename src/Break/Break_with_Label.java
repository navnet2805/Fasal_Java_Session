package Break;

public class Break_with_Label {
    public static void main(String[] args) {

        java: //label
        for (int j=1 ; j<=3 ; j++) //outer
        {
            for (int i=1 ; i<=5 ; i++) //inner
            {
                if (i==4)
                    break java;
                System.out.println(i);
            }//end of inner
        }//end of outer
        System.out.println("end of statement");
    }//end of main
}
