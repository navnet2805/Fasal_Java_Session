package Classloading_process;

public class S_NS_blocks {

    static
    {
        System.out.println("static block");
    }

    {
        System.out.println("non static block");
    }

     static public void main(String[] args) {
        S_NS_blocks obj1 = new S_NS_blocks();

        S_NS_blocks obj2 = new S_NS_blocks();
    }


}
