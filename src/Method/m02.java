package Method;

public class m02 {

//    protected void meth02(int a,int b)  ---> same method signature in a single class is not allowed.
//    {
//        int sum=0;
//        sum = a+b;
//
//    }

    public static int meth02(int a,int b)
    {
        int sum=0;
        sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        int a=1;
        int b=2;
        int result = meth02(a,b);
        System.out.println(result);

        //System.out.println(meth02(a,b));
    }
}
