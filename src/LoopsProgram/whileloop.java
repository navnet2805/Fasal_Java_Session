package LoopsProgram;

public class whileloop {

    public static void main(String[] args) {

//        System.out.println(num*1); 3
//        System.out.println(num*2); 6
//        System.out.println(num*3); 9
//        System.out.println(num*4);
//        System.out.println(num*5);
//        System.out.println(num*6);
//        System.out.println(num*7);
//        System.out.println(num*8);
//        System.out.println(num*9);
//        System.out.println(num*10);

        /*
        repatative actions:
        - multiplication
        - num value
        - sout statement
        i++ = i = i+2
         */

        int num = 3;

        int i = 11; // initialzation for the while loop
        while (i<=10)
        {
            System.out.println(num*i);
            i++;
        }
        System.out.println("last line");

    }
}
