package Constructor.SuperMethod;

public class Child extends Parent {

    Child()
    {
        //super() will always be there as the 1st line defined by JVM.
        this(2,3);
        System.out.println("from child default constructor");
    }

    Child(int a,int b)
    {
        System.out.println("from child 2 param constructor");
    }

    public static void main(String[] args) {
        Child obj = new Child();
    }
}
