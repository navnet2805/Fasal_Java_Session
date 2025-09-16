package Constructor.ThisMethod;

public class ConstructorChaining_thismethod {

    //NS variables
    int a,b,c;
    //int z=20;

    {
        this.a=10;
    }

    ConstructorChaining_thismethod()
    {
        this(2,3);
        System.out.println("Default constructor");
    }

    ConstructorChaining_thismethod(int x, int y)
    {
        this(1);
        this.a=x;
        this.b=y;
        System.out.println("2 param constructor");
    }

    ConstructorChaining_thismethod(int a)
    {
        this(1,2,3);
        this.a=a;
        this.b=b;
        System.out.println("1 param constructor");
    }

    ConstructorChaining_thismethod(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("3 param constructor");
    }

    public static void main(String[] args) {
        ConstructorChaining_thismethod obj = new ConstructorChaining_thismethod();
//        ConstructorChaining_thismethod obj1 = new ConstructorChaining_thismethod(2,3);
//        ConstructorChaining_thismethod obj2 = new ConstructorChaining_thismethod(4);
//        ConstructorChaining_thismethod obj3 = new ConstructorChaining_thismethod(1,2,3);
    }
}
