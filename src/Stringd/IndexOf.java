package Stringd;

public class IndexOf {

    public static void main(String[] args) {

        String s = "Java";

        System.out.println(s.indexOf('c')); //charact c is not present in string s

        System.out.println(s.indexOf('v')); //2

        System.out.println(s.indexOf('a')); // 1

        System.out.println(s.lastIndexOf('a')); //3
    }

}
