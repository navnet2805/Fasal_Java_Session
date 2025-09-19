package Classloading_process.Inheritence;

public class Child1 extends Parent1 {
    int a1 = 10;

    static int b1 = 20;

    Child1()
    {
        System.out.println("from C const");
    }

    static {
        System.out.println("from C static");
    }

    {
        System.out.println("from C ns");
    }

    public static void main(String[] args) {
        Child1 obj = new Child1();
        System.out.println(obj.a1);
    }
}
