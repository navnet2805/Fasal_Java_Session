package AccessModifier;

import static AccessModifier.P01.*;

public class P02 {
    int j = 10;

    public static void publicmethodP02()
    {
        System.out.println("public method from P02");
    }

    private static void privatemethodfromP02()
    {
        System.out.println("private method from P02");
    }

    static void defaultmethodfromP02()
    {
        System.out.println("default method from P02");
    }

    public static void main(String[] args) {
        publicmethodP01();
        //privatemethodfromP01();
        defaultmethodfromP01();
    }
}
