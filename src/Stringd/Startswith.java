package Stringd;

public class Startswith {

    public static void main(String[] args) {

        String s = "Java";


        System.out.println(s.startsWith("J")); //true
        System.out.println(s.startsWith("j")); //false

        System.out.println(s.endsWith("a")); //true
        System.out.println(s.endsWith("z")); //false

    }
}
