package Final;

public class Objectref {
    int i=5;

    public static void main(String[] args) {
         final Objectref obj = new Objectref(); //object creation
          obj.i = 10;
        System.out.println(obj.i);

       // obj = new Objectref(); //new object
        obj.i=20;
        System.out.println(obj.i);
    }
}
