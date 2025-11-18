package Stringd;

public class StringBufferBuilder_Mutable {

    public static void main(String[] args) {
        //StringBuilder  obj =new StringBuilder("Java");
        StringBuffer obj = new StringBuffer("Java");
        System.out.println(obj);
        System.out.println(obj.append("Program"));
        System.out.println(obj); //mutable in nature
        System.out.println(obj.reverse());

        //append() -- same as concat() in string
        //insert()
        //delete()
        //reverse();
    }

}
