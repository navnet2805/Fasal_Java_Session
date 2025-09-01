package Classloading_process;

public class FromNS_to_S_NS {

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
        System.out.println(i);
        m01();
        System.out.println(j);
        m02();
    }

    public void m02()//non static method
    {
        System.out.println("non static method");
    }


    public static void main(String[] args) {
        FromNS_to_S_NS obj = new FromNS_to_S_NS();
    }
}
