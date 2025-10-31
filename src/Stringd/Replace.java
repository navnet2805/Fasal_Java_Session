package Stringd;

public class Replace {

    public static void main(String[] args) {

        String s = "Java";

        s = s.replace('J','P');
        System.out.println(s);

        s = s.replaceAll(s,"Program");
        System.out.println(s);

        s = s.replaceFirst(s,"P");
        System.out.println(s);
    }
}
