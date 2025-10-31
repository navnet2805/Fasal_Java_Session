package Stringd;

public class SubString {

    public static void main(String[] args) {

        String s = "JavaProgramming";

        //1 param - begin index
        System.out.println(s.substring(4));

        //2 param - begin & end index
        System.out.println(s.substring(0,4)); //end index is always compared as <= index || so end index should alway be given as + 1

    }
}
