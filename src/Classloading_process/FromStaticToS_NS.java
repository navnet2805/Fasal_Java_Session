package Classloading_process;

public class FromStaticToS_NS {

    //static
    static int i = 10; //static variable

    static { //static block
        System.out.println("static block");
    }

    public static void m01()//static method
    {
        System.out.println("static method");
    }

    //---------------------------------------------
     int j = 20; //non static variable

    {//non static block
        System.out.println("non static block");
    }

    public void m02()//non static method
    {
        System.out.println("non static method");
    }

    public static void main(String[] args) { //main is always static

        System.out.println(i);
        System.out.println(FromStaticToS_NS.i);
        m01();
        FromStaticToS_NS.m01(); //using class name
       // System.out.println(j); //--> non-static variable j cannot be referenced from a static context
        FromStaticToS_NS obj = new FromStaticToS_NS();
        System.out.println(obj.j);
        obj.m02();
    }
}
