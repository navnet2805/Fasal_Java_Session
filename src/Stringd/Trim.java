package Stringd;

public class Trim {

    public static void main(String[] args) {

        String s = "   JaVa  java     ";

        System.out.println(s.length()); //18

       s = s.trim(); // trim will remove the trailing spaces || spaces at the begining and at the end of string

        System.out.println(s.length()); //10

    }
}
