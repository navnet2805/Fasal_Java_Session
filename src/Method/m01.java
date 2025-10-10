package Method;

public class m01 {

   static int a = 10;
   final int b=9;
    public static void meth01() //called method
    {
        System.out.println("this is from method body");
    }

    public static void main(String[] args) {

        System.out.println("this is from main body");
        System.out.println("this is the end of program");
        meth01(); //calling method
    }
}
