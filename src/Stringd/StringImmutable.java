package Stringd;

public class StringImmutable {

    public static void main(String[] args) {
        String s = "Java";
        String s1 = new String("Python");
        System.out.println(s1);
        System.out.println(s.concat("Program"));
        System.out.println(s); //immutable


    }
}
