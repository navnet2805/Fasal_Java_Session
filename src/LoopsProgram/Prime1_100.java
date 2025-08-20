package LoopsProgram;

public class Prime1_100 {

    public static void main(String[] args) {

        int prime=0;
        System.out.println("1 is a prime");

        for (int num=2 ; num<=100 ; num++) // num to check prime or not from 1 to 10
        {
            for (int i=1; i<=num ; i++)
        {
            if (num%i==0)
            {
                prime++; //0
            }
        }//outside of inner for loop
        if (prime==2) {
            System.out.println(num + " is prime"); //2
        }

            prime =0;
        }//outside of outer for loop

        //==================================================================
//        int num = 3;
//        int prime = 0;
//
//        for (int i=1; i<=num ; i++)
//        {
//            if (num%i==0)
//            {
//                prime++;
//            }
//        }
//        if (prime==2)
//            System.out.println("is prime");
    }
}
