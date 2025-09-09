package AccessModifier;

public class P01 {

    int i = 10;

    public static void publicmethodP01() {
        System.out.println("public method from P01");
    }

    private static void privatemethodfromP01() {
        System.out.println("private method from P01");
    }

    static void defaultmethodfromP01() {
        System.out.println("default method from P01");
    }

    public static void main(String[] args) {
        publicmethodP01(); //public we can access
        privatemethodfromP01();
        defaultmethodfromP01();

    }
}
