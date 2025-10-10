package Interface;

public interface Intf_01 {

    int a = 10; //static and final

    public static void m01()
    {
        System.out.println("Java");
    }

    //access modifier will be public in interface
    void m02(); //public abstract method

    public void m05();

    abstract void m03(); // public abstract method

    default void m04(){
        System.out.println("from default method interface");
    }

    static void m06(){
        System.out.println("From interface static method");
    }

}
