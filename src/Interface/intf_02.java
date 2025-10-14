package Interface;

public interface intf_02 {

    int a = 30;

    static void k01()
    {
        System.out.println("from interface static method");
    }

    default void k02()
    {
        System.out.println("from interface default method");
    }

    void k03();
}
