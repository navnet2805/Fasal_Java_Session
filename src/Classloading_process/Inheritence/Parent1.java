package Classloading_process.Inheritence;

public class Parent1 {
    int a = 10;

    static int b = 20;

    Parent1()
    {
        System.out.println("from P const");
    }

    static {
        System.out.println("from P static");
    }

    {
        System.out.println("from P ns");
    }


}
