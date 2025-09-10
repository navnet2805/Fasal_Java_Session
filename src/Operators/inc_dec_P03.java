package Operators;

public class inc_dec_P03 {
    public static void main(String[] args) {
        int m = 0, n = 0; //n=-2 m=-2

        int p = --m * --n * n-- * m--;
        //    =  -1 * -1  * -1  * -1

        System.out.println(p);
    }
}
