package Stringd;

public class s01 {

    public static void main(String[] args) {
        String s = "program";
        String s1 = new String("java");
        String s2 = "java";
        String s3 = "program";
        s.concat("ing");
        s1 = s1.concat("Programming");
        String s4 = "Program";
        String s5 = new String("Program");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        //== operator will compare the reference type to which value and in the same area.
        System.out.println(s==s1);
        System.out.println(s==s2);
        System.out.println(s==s3);
        System.out.println(s==s4);
        System.out.println(s5==s1);
        System.out.println(s5==s4); //s5 pointing to heap || s4 is pointing to scp area.

        System.out.println("equals()");
        System.out.println(s.equals(s1)); //false
        System.out.println(s.equals(s2)); //
        System.out.println(s.equals(s3)); //true
        System.out.println(s.equals(s4)); //false




    }
}
