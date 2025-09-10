package Operators;

public class P04 {
    public static void main(String[] args) {

        int x = 1, y=10, z=100;
        //
        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
        //    = 0   + 10  - 100 - 98  + 12  - (-1) + 12 - (-2) --- original value
        //    =-161
        //bracket - mul/div -add/sub ---> Left to right

        System.out.println("x="+x); //-2
        System.out.println("y="+y); //11
        System.out.println("z="+z); //98
        System.out.println("i="+i); //161
    }
}
