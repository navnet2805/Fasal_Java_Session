package Interface;

public class Class_02 implements intf_02{

    int b = 10;

    public void k03(){
        System.out.println("implemented in class level");
    }

    public void k04()
    {
        System.out.println("from class method");
    }

    public static void main(String[] args) {
        Class_02 obj = new Class_02();
        //variables
        System.out.println(obj.b);
        System.out.println(obj.a);
        System.out.println(a);
        System.out.println(intf_02.a);

        //method
        //obj.k01(); --> this is static from interface level
        obj.k02();
        obj.k03();
        obj.k04();
        //=============================================
        intf_02 obj1 = new Class_02();

        //variable
        //System.out.println(obj1.b);
        System.out.println(obj1.a);
        System.out.println(a);
        System.out.println(intf_02.a);

        //method
        intf_02.k01();
        //obj.k01();
        obj1.k02();
        obj1.k03();
        //obj1.k04();

    }
}
