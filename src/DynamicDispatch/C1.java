package DynamicDispatch;

public class C1 extends P1{
    int a1 = 10;

    static int b1 = 20;

    public static void CM()
    {
        System.out.println("from child method");
    }

    @Override
    public void PMC()
    {
        System.out.println("from child method1");
    }


    public static void main(String[] args) {
        P1 obj = new C1(); //Dynamic dispatch
        System.out.println(obj.a);
        obj.PM();
        obj.PMC();
        //obj.CM(); // can not access as it is defined only in child



    }
}
