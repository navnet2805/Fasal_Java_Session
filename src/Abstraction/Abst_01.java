package Abstraction;

public abstract class Abst_01 {

    int a = 10; //non static member

    //final
   final int c = 30;

    //static
    static int b = 20;

    Abst_01()
    {
        System.out.println("constructor");
    }

    static {
        System.out.println("static block");
    }

    {
        System.out.println("ns block");
    }

    public static void m03()
    {
        System.out.println("method");
    }


    public void m04()
    {
        System.out.println(" nsmethod");
    }

   abstract void sum(); //default access modifier


    public static void main(String[] args) {
      // new Abst_01(); //-- Object creation is not allowed

    }
}
