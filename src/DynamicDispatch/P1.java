package DynamicDispatch;

public class P1 {
    int a = 50;

    static int b = 20;

    public static void PM()
    {
        System.out.println("from parent method");
    }

    public void PMC()
    {
        System.out.println("from parent PMC");
    }


}
