package AccessModifier1;

import static AccessModifier.P01.*;

public class P03 {
    int k = 10;

    public static void publicmethodP03()
    {
        System.out.println("public method from P03");
    }

    private static void privatemethodfromP03()
    {
        System.out.println("private method from P03");
    }

    static void defaultmethodfromP03()
    {
        System.out.println("default method from P03");
    }

    public static void main(String[] args) {

        publicmethodP01();
        //privatemethodfromP01();
        //defaultmethodfromP01();
    }
}
