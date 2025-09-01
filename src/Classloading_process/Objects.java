package Classloading_process;

public class Objects {

    //static variable
    static int i=10;

    //---------------------------------------------
    int j = 20; //non static variable

    {//non static block
        System.out.println("non static block");
    }

    public void m02()//non static method
    {
        System.out.println("non static method");
    }

    public static void main(String[] args) {
        Objects obj = new Objects();
        System.out.println(obj.j);
        System.out.println(obj.i);
        System.out.println("========================");
        Objects obj1 = new Objects();
        System.out.println("check" +obj1.j);
        obj1.j=30; //value of j using obj1
        obj1.i=40; //value of i using obj1
        System.out.println(obj1.j); //30
        System.out.println(obj1.i); //40
        System.out.println("===========================");
        System.out.println(obj.i); // 10  ---40
        System.out.println(obj.j); //20 -----
        System.out.println(obj1.i); //40 ----
        System.out.println(obj1.j); //30 ----
        System.out.println(i); //10 ---------40

    }
}
