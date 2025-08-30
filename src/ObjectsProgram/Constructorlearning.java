package ObjectsProgram;

public class Constructorlearning {

    Constructorlearning() //zero paramterized constructor || default constructor
    {
        System.out.println("Object created");
    }

    {
        System.out.println("un-named blocked 1");
    }

    static
    {
        System.out.println("un-named block 2");
    }

    public static void meth() //this will not be executed, because we did not call it
    {
        System.out.println("from meth");
    }

    public static void main(String[] args) {

        //create an object
        Constructorlearning obj = new Constructorlearning();
    }
}
