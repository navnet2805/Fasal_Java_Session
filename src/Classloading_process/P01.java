package Classloading_process;

public class P01 {

    static //static block
    {
        System.out.println("from static block1");
    }

    P01()
    {
        System.out.println("from constructor");
    }

    static int i=10; //static variable

    int j=20; //non-static variable


    //non-static block
    {
        System.out.println("from non static block");
        int i = 30; //i is a local variable
    }

    public static void meth() //static method
    {
        System.out.println("from static method");
    }

    public void meth1() //non-static method
    {
        int i = 20; // i is a local variable
        System.out.println("from non-static method");
    }


    public static void main(String[] args) {
        //1st line of the main method.
        System.out.println("program started");
        System.out.println("1st line of main method");

        int i = 10; //i is static and local variable
        P01 obj = new P01(); //object creation

        obj.meth1();

        meth();
        P01.meth();
        System.out.println("end of main");
    }


    static //static block
    {
        System.out.println("from static block2");
    }
}
