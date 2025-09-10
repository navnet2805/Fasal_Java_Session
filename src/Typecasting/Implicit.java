package Typecasting;

public class Implicit {

    public static void main(String[] args) {

        //implicit - auto widening

        byte b = 10;
        short c = b; // short has bigger size compared to byte
        int d = c ;
        long e = d;
        double f = e ;

        byte a1 = 10;
        int r = 20;
        int g = a1+r;
        System.out.println(a1+r);
    }
}
