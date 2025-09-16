package Constructor;

public class Parent {

    Parent()
    {
        this(2,3);
        System.out.println("from parent default constructor");
    }

    Parent(int a,int b)
    {
        System.out.println("from parent 2 param constructor");
    }
}
