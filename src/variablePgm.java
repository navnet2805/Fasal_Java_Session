public class variablePgm
{
   int i = 10; // is a global variable

    static int j = 2; // static variable / static global variable // static instance variable

    public static void main(String[] args)
    { // start of main method
      int j = 10; // local variable - specific to the block

        for (int a = 1; a<5 ; a++)
        {
            System.out.println(j); // usage of local variable
        }

    } // end of main method

    int a = 2; // global variable
}
