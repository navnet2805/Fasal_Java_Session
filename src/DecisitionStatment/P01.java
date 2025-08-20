package DecisitionStatment;
/*
1. print the number from 1 to 10
2. condition : print only even numbers from 1 to 10
 */
public class P01 {

    public static void main(String[] args) {

        for (int i = 1 ; i<=10 ; i++)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
        }
        System.out.println("out of the loop");
    }
}
